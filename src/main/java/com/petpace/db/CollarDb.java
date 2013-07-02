package com.petpace.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CollarDb {
	private static Connection con = null;

	public CollarDb(Connection con) {
		this.con = con;
	}
	
	public CollarMessage getCollarMessage() throws SQLException{
		
		PreparedStatement pstmt = con
				.prepareStatement("SELECT * FROM rigel.collars WHERE id = 1007");
		ResultSet rs = pstmt.executeQuery();
		CollarMessage message = null;
		while (rs.next()) {
			message = new CollarMessage();
			message.setCollarId(rs.getInt("collarId"));
			message.setGatewayId(rs.getString("gateway_id"));
		}
		return message;
	}
}
