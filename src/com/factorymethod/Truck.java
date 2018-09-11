package com.factorymethod;

import java.util.Arrays;
import java.util.List;

public class Truck implements Transport {

	private int horsePower;
	private String transmission;
	private int grossTonnage;
	
	public Truck() { 
		// these details must come from any external means (say property file).		
		this.horsePower = 500; // in hp
		this.transmission = "10-speed-automatic";
		this.grossTonnage = 20; // in tons
	}

	@Override
	public void fueling() {
		// implementation to fuel the Truck.
		System.out.println("Fueling the Truck.");
	}

	@Override
	public void loadCargo(List<Object> items) {
		// implementation to load the list of items as cargo to Truck
		System.out.println("Loading the cargo with list of items " + Arrays.asList(items) + " in the Truck");
	}

	@Override
	public void deliver(String address) {
		// implementation to delivery the cargo to the specified address
		System.out.println("Delivering the cargo in Truck to this addresss: " + address);		
	}
}
