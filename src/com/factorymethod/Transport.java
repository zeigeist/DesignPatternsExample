package com.factorymethod;

import java.util.List;

public interface Transport {
	void fueling();
	void loadCargo(List<Object> items);
	void deliver(String address);
}
