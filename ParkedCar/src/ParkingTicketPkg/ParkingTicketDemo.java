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
public class ParkingTicketDemo {
   public static void main(String[] args)
   {
      ParkedCar myCar = new ParkedCar("Volkswagen", "1972","Red", "147RHZM", 125);
      ParkingMeter myMeter = new ParkingMeter(60);
      PoliceOfficer myOfficer = new PoliceOfficer("Joe Friday", 4788);
      ParkingTicket myTicket = new ParkingTicket(myCar,myOfficer, myMeter);
       
      if(myTicket != null){
        System.out.println(myMeter);
        System.out.println(myTicket);
      }
      else
        System.out.println("No crimes committed!");
   } 
}
