package com.arrays;

public class
ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,7,3,3};
        int arr2[]=new int[arr.length];
        int j=arr.length-1;

        for(int i=0;i<arr.length;i++){

            arr2[j]=arr[i];
            j--;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
