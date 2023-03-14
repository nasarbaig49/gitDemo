package com.java;

public class SortArray {
    int arr[];
    int sortedArray[];

    SortArray(int arr[]){
        this.arr=arr;
    }
    public int[] sort(){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        SortArray a=new SortArray(new int[]{1, 3, 1, 0, 3});
        int sortedArray[]=a.sort();
        for(int i:sortedArray){
            System.out.println(i);
        }


    }
}