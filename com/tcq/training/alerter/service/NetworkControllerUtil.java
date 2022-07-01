package com.tcq.training.alerter.service;

import com.tcq.training.alerter.tests.NetworkAlerterTest;

public class NetworkControllerUtil {

	public static NetworkController getNetworkController() {
		return new NetworkController(new NetworkAlerterTest());
	}

}
