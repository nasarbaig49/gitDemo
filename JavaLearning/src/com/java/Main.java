package com.java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter the text");
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        text=text.toLowerCase();
        String vowels="aeiou";

        for(int i=0;i<text.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(text.charAt(i)==vowels.charAt(j)){
                    System.out.println(text.charAt(i));
                }
            }
        }

    }
    }





