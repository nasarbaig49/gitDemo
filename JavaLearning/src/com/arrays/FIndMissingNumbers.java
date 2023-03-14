package com.arrays;

public class FIndMissingNumbers {
    public static void main(String[] args) {
        int start=5;
        int end=10;
        int[] arr={5,6,7,10};
        int[] newarr=new int[end+1];

        for(int i:arr){
            newarr[i]=i;
        }

        for(int i=start;i<newarr.length;i++){
            if(newarr[i]==0)
            System.out.println(i);
        }



    }
}
