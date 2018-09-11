package com.factorymethod;

public class SeaLogistics extends Logistics {

	// Factory Method
	@Override
    public Transport createTransport() {
		// these details must come from any external means (say property file).
		int maxSpeed = 17; // in knots
		int cruisingSpeed = 10; // in knots
		int grossTonnage = 2000; // in tons
		
    	return new Ship(maxSpeed, cruisingSpeed, grossTonnage);
    }    
}
