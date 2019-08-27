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
public class ParkingTicket {
   private ParkedCar car;
   private PoliceOfficer officer;
   private ParkingMeter meter;
   int minutes;
   int hours;
   double fine;
   double BASE_FINE = 25.0;
   double HOURLY_FINE = 10.0;
   
   
  
   
   public ParkingTicket()
   {  
      car = new ParkedCar();
     officer = new PoliceOfficer();
      meter = new ParkingMeter();
   } 
   
   public ParkingTicket(ParkedCar c, PoliceOfficer o,
                        ParkingMeter m)
   {
      car = new ParkedCar(c);
      officer = new PoliceOfficer(o);
      meter = new ParkingMeter(m);  
   }  
    
   public ParkingTicket(ParkingTicket object2)
   {
      car = object2.car;
      officer = object2.officer;
      meter = object2.meter;
    
   }                   

   /* ParkingTicket(ParkedCar myCar, PoliceOfficer myOfficer, ParkingMeter myMeter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
   public ParkedCar getParkedCar()
   {
      return new ParkedCar(car);
   }
    
   public PoliceOfficer getPoliceOfficer()
   {
      return new PoliceOfficer(officer);
   }
    
   public ParkingMeter getParkingMeter()
   {
      return new ParkingMeter(meter);
   }
 
   public double getFine()
   {
      double ticket;
       
      if (car.minutes <= meter.minutesPurchased)
      {
         ticket = 0;
      }
      else
         ticket = BASE_FINE + (HOURLY_FINE * ((car.minutes - meter.minutesPurchased) / 60)); 
          
      return ticket;    
    
   }
  
   public String toString()
   {
      String str = "\nVehicle information:\n" +
                  car +
                  "\n\nOfficer information:\n" +
                  officer + 
                  "\nFine: $" + getFine();
      return str;
   }
    
   public boolean equals(ParkingTicket ParkingTicket2)
   {
      boolean status;
       
      if(car.equals(ParkingTicket2.car) &&
         officer.equals(ParkingTicket2.officer) &&
         meter.equals(ParkingTicket2.meter) &&
         getFine() == ParkingTicket2.getFine())
          
         status = true;
      else
         status = false;
          
      return status;      
   }
}
