package com.java.learning.abstraction;

public abstract class Car {
    int steering;
    int brake;
    int height;
    Car(){
        System.out.println("Inside car constructor");
    }
    public void applyBrake(){
        System.out.println("applying brake");
    }

    abstract public void accelerate();
}
