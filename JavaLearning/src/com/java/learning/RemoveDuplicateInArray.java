package com.java.learning;

import java.util.Arrays;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 7, 3, 4, 9};
        int j=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }


    }
}