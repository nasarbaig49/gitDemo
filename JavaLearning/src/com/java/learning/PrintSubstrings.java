package com.java.learning;

import java.util.ArrayList;
import java.util.List;

public class PrintSubstrings {
    public static void main(String[] args){
        String str="FUN";

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(i+" "+(j+1));
                System.out.println(str.substring(i,j+1));
                List<Integer> arr=new ArrayList<Integer>();
            }

        }
    }
}
