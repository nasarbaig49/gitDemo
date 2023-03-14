package com.java;

public class CompareStringAndStringBuffer {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer(("Nasar Biag"));
        String str=new String("Nasar Biag");
        System.out.println(str.compareToIgnoreCase(sb.toString())); //returns 0 incase of 100% match
        System.out.println(str.contentEquals(sb));
        System.out.println(str.equalsIgnoreCase(sb.toString()));
    }
}
