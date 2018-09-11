package com.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class DeliveryApp {

   public static void main (String[] args) {
	  // define the roadLogistics to get the Truck transport mode to deliver cargo
      Logistics roadLogistics = new RoadLogistics();
      Transport transport1 = roadLogistics.createTransport();
      ((Truck) transport1).fueling(); // fueling the truck
      List<Object> items1 = new ArrayList<Object>();
      items1.add("iPhone6");
      items1.add("iPhone7");      
      ((Truck) transport1).loadCargo(items1); // loading cargo items
      transport1.deliver("1 Wall Street, NY, USA"); // deliver the cargo to given address
            

	  // define the seaLogistics to get the Ship transport mode to deliver cargo
      Logistics shipLogistics = new SeaLogistics();
      Transport transport2 = shipLogistics.createTransport();      
      ((Ship) transport2).fueling(); // fueling the truck
      List<Object> items2 = new ArrayList<Object>();
      items2.add("Samsung Galaxy 7");
      items2.add("Samsung Galaxy 8");      
      ((Ship) transport2).loadCargo(items2); // loading cargo items
      transport2.deliver("1 Downing Street, London, UK"); // deliver the cargo to given address
   }
}
