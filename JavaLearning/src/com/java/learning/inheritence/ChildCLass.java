package com.java.learning.inheritence;

public class ChildCLass extends ParentClass{
    int radius;
    int diameter;

    ChildCLass(int height,int breadth,int radius, int diameter){
        super(height,breadth);
        this.diameter=diameter;
        System.out.println("Inside Child class constructor with params and super");
    }

    ChildCLass(int radius, int diameter){
        this.diameter=diameter;
        System.out.println("Inside Child class constructor with params");
    }

    ChildCLass(){
        System.out.println("Inside Child class constructor without params");
    }
}
