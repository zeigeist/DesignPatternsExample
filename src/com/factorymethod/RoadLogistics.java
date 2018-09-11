package com.factorymethod;

public class RoadLogistics extends Logistics {
		
	// Factory Method
	@Override
    public Transport createTransport() {
		// these details must come from any external means (say property file).
		int horsePower = 500; // in hp
		String transmission = "10-speed-automatic";
		int grossTonnage = 20; // in tons
		
    	return new Truck(horsePower, transmission, grossTonnage);
    }
}
