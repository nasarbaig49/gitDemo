package com.java.learning.inheritence;

public class Bsa {
    public static void main(String args[]){
        MountainBike mountainBike=new MountainBike(10,2,3);
        mountainBike.setSeatAdjustment(100);
        mountainBike.applyBrake(1);
        System.out.println(mountainBike.gear);
        System.out.println(mountainBike.seatAdjustment);
        System.out.println("Speed of Mountain Bike is: "+mountainBike.speed);

        BikePrototype mountainBike2=new MountainBike(10,2,3);
        System.out.println("Speed of Mountain Bike2 is: "+mountainBike2.speed);
        System.out.println("Speed of Mountain Bike1 is: "+mountainBike.speed);




    }
}
