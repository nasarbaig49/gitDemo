package com.java.learning.inheritence;

public class BikePrototype {
    int gear;
    int speed;

    BikePrototype(int startSpeed,int startGear){
        gear=startSpeed;
        speed=startGear;
    }
    public void setGear(int newValue){
        gear=newValue;
    }
    public void applyBrake(int decrement){
        speed-=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }

}
