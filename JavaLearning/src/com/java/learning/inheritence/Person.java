package com.java.learning.inheritence;

public class Person {

    int x;
    static int y;
    static int count=0;
    static void met(int a){
        count++;
        System.out.println("inside met "+count);
    }

    void speak(){
        System.out.println("Person speaking");
    }

    void listening(){
        System.out.println("Person listening");
    }
}
