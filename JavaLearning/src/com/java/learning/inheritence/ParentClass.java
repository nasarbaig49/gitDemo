package com.java.learning.inheritence;

public class ParentClass {
    int height;
    int weight;
    static int breadth=10;

    ParentClass(){
        System.out.println("Inside Parent class constructor without params");
    }
    ParentClass(int height,int weight){
        System.out.println("Inside Parent class constructor with params");
        this.height=height;
        this.weight=weight;
    }
}
