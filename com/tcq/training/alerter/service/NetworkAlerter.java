package com.tcq.training.alerter.service;

import com.tcq.training.alerter.api.INetworkAlerter;

public class NetworkAlerter implements INetworkAlerter {

	@Override
	public int alert(float celcius) {
		System.out.println("ALERT: Temperature is " + celcius + " celcius");
		// Return 200 for ok
		// Return 500 for not-ok
		// stub always succeeds and returns 200
		return 200;

	}

}
