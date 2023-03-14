package com.java.learning;

import java.util.Arrays;

public class FIndLargestAndSmallestInArray {
    public static void main(String args[]){
        int arr[]={1,3,4,2,9,9,0,2};
        int max=0;
       // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    max=arr[j];
                    arr[j]=arr[i];
                    arr[i]=max;

                }
            }
        }
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i+1]);//2nd larhest
                break;
            }
            else{
                i++;
            }
        }

        //System.out.println(arr[arr.length-1]);//Largest
        int j=arr.length-1;
        while(j>0){
            if(arr[j]!=arr[j-1]){
                System.out.println(arr[j-1]);//2nd smallest
                break;
            }
            else{
                j--;
            }
        }

    }
}
