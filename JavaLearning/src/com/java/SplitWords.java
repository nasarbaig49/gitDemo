package com.java;

public class SplitWords {
    public static void main(String[] args){
        String str="madam is wow";
        String[] word=str.split(" ");
        for(String i:word){
            System.out.println(i);
        }
    }
}
