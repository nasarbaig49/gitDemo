package com.java;

public class Fibanocci {

    public static void main(String[] args){
        int a=1;
        int b=1;
        int c;
        System.out.print(a+" "+b);
        while(b<20){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);

        }


    }
}
