package com.java.learning.interfaces;

public class MountainBike implements BikePrototype{

    @Override
    public void setPrice(String nameOfBycycle) {
        if(nameOfBycycle=="StreetCat") {
            System.out.println("Price is 300");
        }
            else{
                System.out.println("Price is 1000");
            }
    }
}

