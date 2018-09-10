package com.factory;

import java.util.ArrayList;
import java.util.List;

public class DeliveryApp {

   public static void main (String[] args) {
      Factory factory = new Factory();

      //get an object of Truck to deliver cargo
      Transport transport1 = factory.deliver("Truck");
      ((Truck) transport1).fueling();
      List<Object> items1 = new ArrayList<Object>();
      items1.add("iPhone6");
      items1.add("iPhone7");      
      ((Truck) transport1).loadCargo(items1);      
      transport1.deliver("1 Wall Street, NY, USA");
      
      //get an object of Ship to deliver cargo
      Transport transport2 = factory.deliver("Ship");      
      ((Ship) transport2).fueling();
      List<Object> items2 = new ArrayList<Object>();
      items2.add("Samsung Galaxy 7");
      items2.add("Samsung Galaxy 8");      
      ((Ship) transport2).loadCargo(items2);      
      transport2.deliver("1 Downing Street, London, UK");
   }
}
