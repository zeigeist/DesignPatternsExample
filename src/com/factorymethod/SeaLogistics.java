package com.factorymethod;

public class SeaLogistics extends Logistics {

	// Factory Method
	@Override
    public Transport createTransport() {
    	return new Ship();
    }    
}
