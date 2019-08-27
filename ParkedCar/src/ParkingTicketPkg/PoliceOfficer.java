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
public class PoliceOfficer {
   private String name;
   private int badgeNumber;
   
   private ParkedCar car;
   private ParkingMeter meter;
   public ParkingTicket ticket;
    
    
   public PoliceOfficer()
   {
      name = "";
      badgeNumber = 0;
      car = new ParkedCar();
      meter = new ParkingMeter();
      ticket = new ParkingTicket();
   }
 
   public PoliceOfficer(String officerName, int officerBadge)
    
   {
      name = officerName;
      badgeNumber = officerBadge;
   }
    
   public void set(String officerName, int officerBadge)
   {
      name = officerName;
      badgeNumber = officerBadge;
   }
    
   public PoliceOfficer(PoliceOfficer object2)
   {
      name = object2.name;
      badgeNumber = object2.badgeNumber;
   }
    
   public String getOfficerName()
   {
      return name; 
   }
    
   public int getOfficerBadgeNumber()
   {
      return badgeNumber; 
   }
  
  
    public ParkedCar getParkedCar()
   {
      return new ParkedCar(car);
   }
    
   public ParkingMeter getParkingMeter()
   {
      return new ParkingMeter(meter);
   }
    
   public ParkingTicket getParkingTicket()
   {
      return new ParkingTicket(ticket);
   }
 
   public ParkingTicket patrol(ParkedCar car, ParkingMeter meter)
   {
       
      if(car.minutes > meter.minutesPurchased)
         return new ParkingTicket(ticket);
      else
         return null;
   }
    
   public String toString()
   {
      String str = "\nOfficer name: " + name +
                   "\nBadge number: " + badgeNumber;
      return str;
   }
    
   public boolean equals(PoliceOfficer PoliceOfficer2)
   {
      boolean status;
       
      if(name.equals(PoliceOfficer2.name) &&
         badgeNumber == PoliceOfficer2.badgeNumber &&
         ticket.equals(PoliceOfficer2.ticket))
         status = true;
      else
         status = false;
          
      return status;      
   }
}
