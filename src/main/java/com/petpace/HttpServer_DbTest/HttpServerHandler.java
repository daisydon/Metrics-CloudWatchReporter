package com.petpace.HttpServer_DbTest;

import java.io.File;
import java.io.IOException;
import java.net.SocketAddress;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Logger;

import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.jboss.netty.handler.codec.frame.TooLongFrameException;
import org.jboss.netty.handler.codec.http.Cookie;
import org.jboss.netty.handler.codec.http.CookieDecoder;
import org.jboss.netty.handler.codec.http.CookieEncoder;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpHeaders.Names;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.jboss.netty.handler.codec.http.QueryStringDecoder;
import org.jboss.netty.util.CharsetUtil;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;

import org.jooq.impl.DSL;
import static org.jooq.impl.DSL.*;
import static com.petpace.db.jooq.Tables.*;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.petpace.db.CollarMessage;
import com.petpace.db.DatasourceConnection;

public class HttpServerHandler extends SimpleChannelHandler{
	private static final Logger logger = Logger
			.getLogger(HttpServerHandler.class.getName());

	private static final String NETTYSESSION_ID_COOKIE_NAME = "NettySessionId";

	/**
	 * Track open channel
	 */

	@Override
	public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {
		// ctx.getPipeline();
		Channel clientChannel = e.getChannel();
		SocketAddress remoteaddress = clientChannel.getRemoteAddress();
		if (remoteaddress != null) {
			logger.info("ChannelOpen Event -Client connected:"
					+ remoteaddress.toString());
		}
	}

	/**
	 * Process received message
	 */
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {

		// write the initial line.
		writeResponse(e);
		e.getChannel().disconnect();
		e.getChannel().close();
	}

	/**
	 * Write response to browser.
	 * 
	 * @param e
	 * @throws Exception
	 */
	public void writeResponse(MessageEvent e) throws Exception {
		HttpRequest request = (HttpRequest) e.getMessage();
		// boolean keepAlive = HttpHeaders.isKeepAlive(request);
		HttpResponse response = new DefaultHttpResponse(HttpVersion.HTTP_1_1,
				HttpResponseStatus.OK);
		StringBuilder buf = new StringBuilder();
		buf.append("<p>HTTP Method: ").append(request.getMethod().getName())
				.append("</p>");
		/**
		 * Parse the query in URL
		 */
		QueryStringDecoder queryStringDecoder = new QueryStringDecoder(
				request.getUri());
		buf.append("<p>URI: ").append(request.getUri()).append("</p>");
		buf.append("<p>PATH: ").append(queryStringDecoder.getPath())
				.append("</p><p>");
		Map<String, List<String>> params = queryStringDecoder.getParameters();
		if (!params.isEmpty()) {
			for (Entry<String, List<String>> p : params.entrySet()) {
				String key = p.getKey();
				List<String> vals = p.getValue();
				for (String val : vals) {
					buf.append("PARA: " + key + "VAL: " + val + "<br/>");
					System.out.println("PARA: " + key + " VAL: " + val);
				}
			}
			buf.append("</p>");
		}
		/**
		 * Four types of HTTP request: GET,POST,DELETE,PUT
		 */
		if (request.getMethod().getName() == "GET") {
		} else if (request.getMethod().getName() == "POST") {
			buf.append(JsonProcessor(request));
		} else if (request.getMethod().getName() == "DELETE") {
		} else if (request.getMethod().getName() == "PUT") {
			buf.append(request.getContent().toString(CharsetUtil.UTF_8))
					.append("</p>");
		}
		
		CollarMessage message = null;
		//message = getCollarMessage();
		buf.append(message.toString());
		
		response.setContent(ChannelBuffers.copiedBuffer(buf.toString(),
				CharsetUtil.UTF_8));
		setCookie(request, response);
		e.getChannel().write(response);
	}
	
public void getCollarMessage() throws SQLException{
	DSLContext create = DSL.using(DatasourceConnection.getDatasource(), SQLDialect.MYSQL);
	Result<Record> result = create.select().from(COLLARS).fetch();
	for (Record r : result) {
        int id = r.getValue(COLLARS.field("id"));
        String collar_id = r.getValue(COLLARS.field("collar_id"));
        String name = r.getValue(COLLARS.field("name"));

        System.out.println("ID: " + id + " title: " + title + " desciption: " + description);
    }

	}

	/**
	 * Check cookies or add new cookies
	 * 
	 * @param e
	 */

	public void setCookie(HttpRequest request, HttpResponse response) {

		String cookieString = request.getHeader(NETTYSESSION_ID_COOKIE_NAME);
		if (cookieString != null) {
			CookieDecoder cookieDecoder = new CookieDecoder();
			Set<Cookie> cookies = cookieDecoder.decode(cookieString);
			if (!cookies.isEmpty()) {
				// Reset the cookies if necessary.
				CookieEncoder cookieEncoder = new CookieEncoder(true);
				for (Cookie cookie : cookies) {
					cookieEncoder.addCookie(cookie);
					response.setHeader(NETTYSESSION_ID_COOKIE_NAME,
							cookieEncoder.encode());
				}
			}
		} else {
			CookieEncoder cookieEncoder = new CookieEncoder(true);
			cookieEncoder.addCookie("name", "value");
			response.addHeader(NETTYSESSION_ID_COOKIE_NAME,
					cookieEncoder.encode());
		}

	}

	/**
	 * Using Jackson Streaming API parse contents in Json format
	 * 
	 * @param jp
	 * @return
	 * @throws JsonParseException
	 * @throws IOException
	 */
	public PersonEntry reader(JsonParser jp) throws JsonParseException,
			IOException {
		PersonEntry result = new PersonEntry();
		if (jp.nextToken() != JsonToken.START_OBJECT) {

			throw new IOException("Expected data to start with an Object");
		}
		while (jp.nextToken() != JsonToken.END_OBJECT) {
			String fieldName = jp.getCurrentName();
			jp.nextToken();
			if (fieldName.equals("name")) {
				result.setName(jp.getText());
			} else if (fieldName.equals("gender")) {
				result.setGender(jp.getText());
			} else if (fieldName.equals("verified")) {
				result.setVerified(true);
			} else if (fieldName.equals("timestamp")) {

				result.setTimestamp(jp.getLongValue());
			} else {
				logger.info("Failure:" + fieldName);
			}
		}
		jp.close();
		return result;
	}

	/**
	 * Using Jackson Streaming API to generate files in Json format
	 * 
	 * @param request
	 * @return
	 * @throws JsonParseException
	 * @throws IOException
	 */
	public String unmarshallJson(HttpRequest request)
			throws JsonParseException, IOException {
		JsonFactory jsonF = new JsonFactory();
		String json = request.getContent().toString(CharsetUtil.UTF_8);

		JsonParser jp = jsonF.createParser(json);
		PersonEntry person = reader(jp);
		JsonFactory jsonG = new JsonFactory();
		JsonGenerator jg = jsonG.createGenerator(new File(
				"Documents:\\out.json"), JsonEncoding.UTF8);

		jg.writeStartObject();
		jg.writeStringField("name", person.getName());
		jg.writeStringField("gender", person.getGender());
		jg.writeNumberField("timestamp", person.getTimestamp());
		jg.writeBooleanField("verified", person.getVerified());
		jg.writeEndObject();
		jg.close();

		JsonParser pars = jsonG.createParser(new File("Documents:\\out.json"));
		PersonEntry per = reader(pars);

		return per.toString();
	}

	/**
	 * Processor to handle with reading and writing data in Json format
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public String JsonProcessor(HttpRequest request) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		PersonEntry person = mapper.readValue(
				request.getContent().toString(CharsetUtil.UTF_8),
				PersonEntry.class);
		logger.info(person.toString());
		ObjectMapper map = new ObjectMapper();

		String result = map.writeValueAsString(person);
		return result;
	}

	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
			throws Exception {

		Channel ch = e.getChannel();
		Throwable cause = e.getCause();
		if (cause instanceof TooLongFrameException) {
			sendError(ctx, HttpResponseStatus.BAD_REQUEST);
			return;
		}
		cause.printStackTrace();
		if (ch.isConnected()) {
			sendError(ctx, HttpResponseStatus.INTERNAL_SERVER_ERROR);
		}

	}

	private void sendError(ChannelHandlerContext ctx, HttpResponseStatus status) {
		HttpResponse response = new DefaultHttpResponse(HttpVersion.HTTP_1_1,
				status);
		response.setHeader(Names.CONTENT_TYPE, "text/plain; charset=UTF-8");

		response.setContent(ChannelBuffers.copiedBuffer(
				"Failure: " + status.getReasonPhrase() + " -- "
						+ status.toString() + "\r\n", CharsetUtil.UTF_8));
		// Close the connection as soon as the error message is sent.
		ctx.getChannel().write(response)
				.addListener(ChannelFutureListener.CLOSE);
	}

}
