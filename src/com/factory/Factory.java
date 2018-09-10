package com.factory;

public class Factory {
	
   //use deliver method to get required transport mode object
   public Transport deliver (String transportMode){
      if(transportMode == null){
         return null;
      }		
      if(transportMode.equalsIgnoreCase("Truck")){
         return new Truck();         
      } else if(transportMode.equalsIgnoreCase("Ship")){
         return new Ship();   
      }
        
      return null;
   }
}
