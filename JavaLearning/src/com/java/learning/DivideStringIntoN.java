package com.java.learning;

import java.util.Scanner;

public class DivideStringIntoN {
    DivideStringIntoN(String s){
        System.out.println("How many partitions?");
        Scanner input=new Scanner(System.in);
        int noOfParts=input.nextInt();
        String eachPart[]=new String[noOfParts];

        if(s.length()%noOfParts!=0){
            System.out.println("Cannot be partitioned");
        }
        else{

            int chars=s.length()/noOfParts;
            int temp=0;
            for(int i=0;i<s.length();i=i+chars){
                String part=s.substring(i,i+chars);
                eachPart[temp]=part;
                temp++;
            }
            for(String str:eachPart){
                System.out.println(str);
            }

        }
    }

    public static void main(String[] args){
        DivideStringIntoN d=new DivideStringIntoN("abcdefghijk4");
    }
}
