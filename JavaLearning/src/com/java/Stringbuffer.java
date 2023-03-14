package com.java;

public class Stringbuffer {

    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Nasar Biag");
        sb.insert(1,"ABC");

        int i=sb.capacity();
        System.out.println(i);

    }
}
