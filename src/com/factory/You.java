package com.factory;
public class You {

   public static void main (String[] args) {
      Factory factory = new Factory();

      //get an object of MobilePhone to make call
      YourCommunicationTool tool1 = factory.getCommunicationTool("MobilePhone");
      String connectID1 = "123-456-7890";
      ((MobilePhone) tool1).showDialPad();      
      tool1.makeCalls(connectID1);
      
      //get an object of HomePhone to make call
      YourCommunicationTool tool2 = factory.getCommunicationTool("HomePhone");      
      ((HomePhone) tool2).transferCall("123-456-7899");
      String connectID2 = "123-456-7890";
      tool2.makeCalls(connectID2);
      
      //get an object of WhatsApp to make call
      YourCommunicationTool tool3 = factory.getCommunicationTool("WhatsApp");
      ((WhatsApp) tool3).showContac();
      String connectID3 = "John Doe";
      tool3.makeCalls(connectID3);
      
      //get an object of GoogleVoice to make call
      YourCommunicationTool tool4 = factory.getCommunicationTool("GoogleVoice");
      ((GoogleVoice) tool4).showContac();
      String connectID4 = "John Doe";
      tool4.makeCalls(connectID4);
   }
}
