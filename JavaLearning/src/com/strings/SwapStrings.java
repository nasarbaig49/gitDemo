package com.strings;

public class SwapStrings {
    public static void main(String[] args) {
        String str1="abc";
        String str2="123";
        int str1Length=str1.length();
        int str2Length=str2.length();
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length(),str1.length());
        System.out.println(str1);

    }
}
