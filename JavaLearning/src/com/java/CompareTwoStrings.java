package com.java;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args){
        System.out.println("Enter string 1");
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        System.out.println("Enter string 2");
       // Scanner input=new Scanner(System.in);
        String str2=input.nextLine();

        System.out.println(str1.equalsIgnoreCase(str2)); //Boolean
        System.out.println(str1.compareToIgnoreCase(str2)); //integer
        System.out.println(str1==str2); //Boolean
        System.out.println(str1.contentEquals(str2));//boolean

        StringBuffer sb=new StringBuffer(str1);

        str1.toLowerCase();
        System.out.println(str1);


    }
}
