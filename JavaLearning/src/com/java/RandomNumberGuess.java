package com.java;

import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args){
        int number=(int) (Math.random()*110)+100;
        int guess;
        System.out.println(number);


        do{
            System.out.println("Enter your guess");
            Scanner input=new Scanner(System.in);
             guess=input.nextInt();
        if(number==guess)
            System.out.println("You are correct");

        else if(guess>number){
            System.out.println("Try with smaller number");
            continue;
        }
        else if(guess<number){
            System.out.println("Try with larger number");
            continue;
        }
        } while(number!=guess);
}}
