package com.java.learning;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String str = "Nasar is Nasar";
        String word[] = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            for(int j=i+1;j<word.length;j++){
               // System.out.println(word[i]+" "+word[j]);
                if(word[j].equalsIgnoreCase(word[i])){
                   System.out.println(word[i]);
                }

            }

        }
    }
}