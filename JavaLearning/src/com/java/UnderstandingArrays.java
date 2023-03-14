package com.java;

import java.util.Scanner;

public class UnderstandingArrays {
    public static void main(String[] args){
        int arr1[]=new int[5];
        int arr2[]=new int[5];
        Scanner input=new Scanner(System.in);
        int i=0,j=0;

        do{

            System.out.println("Enter elements of array");
            int v= input.nextInt();
            arr1[i]=v;
            i++;
        }while(i<arr2.length);

        while(j<arr1.length){
        System.out.println(arr1[j]);
            j++;
        }

        arr2=arr1.clone();


        while(j<arr2.length){
            System.out.println(arr2[j]);
            j++;
        }

        String w=arr2.toString();


        int arr3[]=new int[arr1.length];



    }
}
