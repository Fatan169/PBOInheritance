/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5;

/**
 *
 * @author asus
 */
public class Truck {
    
    public int cadence;
    public int gear;
    public int speed;
   
    public Truck(int startCadence, int startSpeed, int startGear){
      gear = startGear;
      cadence = startCadence;
      speed = startSpeed;
    }
    public void setcadence (int newValue){
        cadence= newValue;
    }
    public void setGear (int newValue){
        gear = newValue;
    }
    public void applybrake (int decrement){
        speed = decrement;
    }
    public void speedUp (int increment){
        speed = increment;
    }
}
