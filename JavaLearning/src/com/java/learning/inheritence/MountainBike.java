package com.java.learning.inheritence;

public class MountainBike extends BikePrototype {
    int seatAdjustment;
    MountainBike(int gear,int speed,int seatAdjustment){
        super(gear,speed);
        this.seatAdjustment=seatAdjustment;
    }
    public void setSeatAdjustment(int seatHeight){
        seatAdjustment=seatHeight;
    }
}
