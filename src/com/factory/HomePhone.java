package com.factory;
import java.util.Arrays;
import java.util.List;

public class HomePhone implements YourCommunicationTool {

	private boolean cordLess;
	private boolean reDialEnabled;
	private List<String> transferCallList;
	
	public HomePhone() {
		this.cordLess = true;
		this.reDialEnabled = true;
		this.transferCallList = Arrays.asList("123-456-7899", "123-456-7898", "123-456-7897");
	}
	
	public void transferCall(String to) {
		// implementation to transfer call using home-phone.
		System.out.println("Transfering your call to " + to + " using home-phone.");
	}
	
	@Override
	public void makeCalls(String connectID) {
		// implementation to make calls using home-phone.
		System.out.println("Calling your friend " + connectID + " using home-phone.");
	}
}
