package com.petpace.HttpServer_DbTest;

import com.codahale.metrics.Clock;
import com.codahale.metrics.Counter;
import com.codahale.metrics.RatioGauge;
import java.util.logging.Logger;

public class RateGauge extends RatioGauge {

	private final Counter counter;
	private final Clock clock;
	private final long startTime;
	private static final Logger LOG = Logger
			.getLogger(RateGauge.class.getName());

	public RateGauge(Counter counter, Clock clock) {
		this.counter = counter;
		this.clock = clock;
		this.startTime = clock.getTick();
	}


	@Override
	protected Ratio getRatio() {
		// TODO Auto-generated method stub
		final long elapsed = clock.getTick() - startTime;
		//LOG.info("Clock is: "+clock.getTick()+"The startTime is: "+startTime);
		return Ratio.of(counter.getCount(), elapsed);	
	}

}
