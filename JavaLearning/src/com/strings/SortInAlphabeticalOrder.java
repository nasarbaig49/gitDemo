package com.strings;

import java.util.Arrays;

public class SortInAlphabeticalOrder {
    public static void main(String[] args) {
        String str="NasarBiag";
        String newstr=str.toLowerCase();
        char[] arr=newstr.toCharArray();

        Arrays.sort(arr);

        for(char c:arr)
        System.out.println(c);
    }
}

