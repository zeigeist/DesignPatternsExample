package com.factory;
public class MobilePhone implements YourCommunicationTool {

	private String planType;
	private String carrierName;
	private boolean locked;
	
	public MobilePhone() {
		this.planType = "PostPaid";
		this.carrierName = "AT&T";
		this.locked = true;
	}

	public void showDialPad() {
		// implementation to show dial-pad.
		System.out.println("Showing the dial-pad of MobilePhone.");
	}

	@Override
	public void makeCalls(String connectID) {
		// implementation to make calls using mobile-phone.
		System.out.println("Calling your friend " + connectID + " using mobile-phone.");
	}
}
