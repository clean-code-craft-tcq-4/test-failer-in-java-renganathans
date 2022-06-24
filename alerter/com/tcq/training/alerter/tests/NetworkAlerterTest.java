package com.tcq.training.alerter.tests;

import com.tcq.training.alerter.api.INetworkAlerter;

public class NetworkAlerterTest implements INetworkAlerter {

	@Override
	public int alert(float celcius) {
		System.out.println("ALERT: Temperature is " + celcius + " celcius");
		// Return 200 for ok
		// Return 500 for not-ok
		// stub always succeeds and returns 200
		if (celcius <= 200)
			return 200;
		else
			return 500;

	}

}
