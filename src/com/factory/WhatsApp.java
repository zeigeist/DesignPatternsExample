package com.factory;
public class WhatsApp implements YourCommunicationTool {

	private String appVersion;
	private String osVersion;
	private String osName;
	
	public WhatsApp() {
		this.appVersion = "1.0";
		this.osVersion = "9";
		this.osName = "iOS";
	}

	public void showContac() {
		// implementation to show contacts to call.
		System.out.println("Showing your contacts in WhatsApp.");
	}

	@Override
	public void makeCalls(String connectID) {
		// implementation to make calls using WhatsApp.
		System.out.println("Calling your friend " + connectID + " using WhatsApp.");
	}
}
