package com.strings;

import java.util.Arrays;

public class StringsFunctioning {
    public void countString(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        System.out.println(count);
    }

    public static void reverseString(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));

        }
    }

    //incomplete
    public static void splitAndPalindrome(String str){
        str=str.toLowerCase();

        String[] word=str.split(" ");
        //Arrays.sort(word);
        for(String i:word){
            String rev="";
            for(int j=i.length()-1;j>=0;j++){
                rev=rev+i.charAt(j);
            }
            reverseString(i);


            }

        }


        }




