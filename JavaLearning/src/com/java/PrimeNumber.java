package com.java;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int count=0;

        if(num==1 || num==0){
            System.out.println("It is not a prime");
        }

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }

        if (count>2){
            System.out.println("It is not a prime");
        }
        else{System.out.println("It is a prime");};
    }
}
