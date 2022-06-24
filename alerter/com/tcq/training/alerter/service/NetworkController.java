package com.tcq.training.alerter.service;

import com.tcq.training.alerter.api.INetworkAlerter;

public class NetworkController {
	INetworkAlerter networkAlerter;

	public NetworkController(INetworkAlerter networkAlerter) {
		this.networkAlerter = networkAlerter;
	}

	public int alert(float celcius) {
		return networkAlerter.alert(celcius);
	}

}
