package com.factorymethod;

public class RoadLogistics extends Logistics {
		
	// Factory Method
	@Override
    public Transport createTransport() {
    	return new Truck();
    }
}
