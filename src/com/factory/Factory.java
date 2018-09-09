package com.factory;

public class Factory {
	
   //use getCommunicationTool method to get the tool of a particular class.
   public YourCommunicationTool getCommunicationTool (String toolName){
      if(toolName == null){
         return null;
      }		
      if(toolName.equalsIgnoreCase("HomePhone")){
         return new HomePhone();         
      } else if(toolName.equalsIgnoreCase("MobilePhone")){
         return new MobilePhone();        
      } else if(toolName.equalsIgnoreCase("WhatsApp")){
         return new WhatsApp();
      } else if(toolName.equalsIgnoreCase("GoogleVoice")){
          return new GoogleVoice();
       }           
      return null;
   }
}
