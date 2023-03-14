package com.strings;

import java.util.LinkedHashSet;

public class FindDupsInString {
    public static void main(String[] args) {
        String str="NasarBiag";
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=' ';
                }
            }
            if(count>0 && arr[i]!=' '){
                System.out.println(arr[i]);

            }

        }
    }
}
