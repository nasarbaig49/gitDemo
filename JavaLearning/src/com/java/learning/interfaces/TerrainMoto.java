package com.java.learning.interfaces;

import com.java.learning.inheritence.BikePrototype;

public class TerrainMoto extends MountainBike {
    public void setPrice(String nameOfBycycle) {
        if(nameOfBycycle=="StreetCat") {
            System.out.println("Price is 300");
        }
        else{
            System.out.println("Price is 1000");
        }
    }
}
