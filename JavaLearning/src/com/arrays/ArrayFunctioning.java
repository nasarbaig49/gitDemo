package com.arrays;

import java.util.Arrays;

public  class ArrayFunctioning {

    public static void getSumOfElementsInArray(int arr[]){
        int sum=0;
        for(int i:arr){
             sum=sum+i;
        }
        System.out.println("sum of array: "+sum);
    }

    public static void getSecondLargestNumber(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){ //2,7,9,7
            if(arr[i]!=arr[i+1]) {
                System.out.println(arr[i + 1]);
                break;
            }

        }

    }


    public static void removeDuplicates(int arr[]){//234233
        int n=arr.length;
        Arrays.sort(arr);
        int[] temp = new int[n];
        for(int i=0;i<arr.length-1;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==0){
                temp[i]=arr[i];
                System.out.println(temp[i]);
            }
    }

        }
    }
