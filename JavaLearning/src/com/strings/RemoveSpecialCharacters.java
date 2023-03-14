package com.strings;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {
        String str="Nasar@!Biag*(&";
        String newString=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(newString);
    }
}
