package com.factorymethod;

import java.util.Arrays;
import java.util.List;

public class Ship implements Transport {

	private int maxSpeed;
	private int cruisingSpeed;
	private int grossTonnage;
	
	public Ship(int maxSpeed, int cruisingSpeed, int grossTonnage) { 
		this.maxSpeed = maxSpeed;
		this.cruisingSpeed = cruisingSpeed;
		this.grossTonnage = grossTonnage;
	}

	@Override
	public void fueling() {
		// implementation to fuel the Ship.
		System.out.println("Fueling the Ship.");
	}

	@Override
	public void loadCargo(List<Object> items) {
		// implementation to load the list of items as cargo to Ship
		System.out.println("Loading the cargo with list of items " + Arrays.asList(items) + " in the Ship");
	}

	@Override
	public void deliver(String address) {
		// implementation to delivery the cargo to the specified address
		System.out.println("Delivering the cargo in Ship to this addresss: " + address);		
	}
}
