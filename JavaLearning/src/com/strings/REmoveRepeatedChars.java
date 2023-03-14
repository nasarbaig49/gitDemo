package com.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class REmoveRepeatedChars {
    public static void main(String[] args) {

        String str = "NasarBiag";
        char[] arr=str.toCharArray();


        //LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        HashSet<Character> set=new HashSet<>();
        //set.addAll(arr);
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println(set);
    }
}