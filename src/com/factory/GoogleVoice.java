package com.factory;

public class GoogleVoice implements YourCommunicationTool {

	private String appVersion;
	private String osVersion;
	private String osName;
	
	public GoogleVoice() {
		this.appVersion = "2.0";
		this.osVersion = "3";
		this.osName = "Android";
	}

	public void showContac() {
		// implementation to show contacts to call.
		System.out.println("Showing your contacts in Google Voice.");
	}

	@Override
	public void makeCalls(String connectID) {
		// implementation to make calls using GoogleVoice.
		System.out.println("Calling your friend " + connectID + " using Google Voice.");
	}
}
