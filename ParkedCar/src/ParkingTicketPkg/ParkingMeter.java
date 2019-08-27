/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingTicketPkg;

/**
 *
 * @author Ethias Young
 */
public class ParkingMeter {
  public int minutesPurchased;
    
   //with no arguments 
   public ParkingMeter()
   {
      minutesPurchased = 0; 
   }
    
   //constructor with arguments
   public ParkingMeter(int purchase)
   {
      minutesPurchased = purchase;
   }

   /* ParkingMeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
   //set method
   public void set(int purchase)
   {
      minutesPurchased = purchase;
   }
    
   //return method
   public int getMinutesPurchased()
   {
      return minutesPurchased; 
   }
    
   public ParkingMeter(ParkingMeter object2)
   {
      minutesPurchased = object2.minutesPurchased;  
   }
  
   public String toString()
   {
      String str = "\nMinutes purchased: " + minutesPurchased;
          
      return str;   
   }  
    
   public boolean equals(ParkingMeter ParkingMeter2)
   {
      boolean status;
       
      if(minutesPurchased == ParkingMeter2.minutesPurchased)
         status = true;
      else
         status = false;
          
      return status;        
}
}