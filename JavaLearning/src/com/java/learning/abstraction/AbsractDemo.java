package com.java.learning.abstraction;

public class AbsractDemo {

    public static void main(String[] args){

        Car tiago=new Tata();
        tiago.accelerate();
        tiago.height=10;
        System.out.println(tiago.height);

        Maruti ignis=new Maruti();
        ignis.height=20;
        System.out.println(ignis.height);
        //Car car=new Car(); --Abstract class cannot be instantiated
        //All the abstact methods should be implemented in the child classes
        //Though user can't call the abstract class's constructor explicitly, java calls the constructor inplicitly as we are extending the abstarct class
        //Abstract class can have abstract class and concrete class

    }

}
