package com.java.learning;

public class FindTheNoOfRepetetionsInString {
    public static void main(String[] args) {
        String str = "Nasar Biag";
        char temp='1';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(str.charAt(i)==temp){
                continue;
            }
            for (int j = i+1; j < str.length(); j++) {
                //System.out.println(i+" "+j);

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    temp=str.charAt(j);
                }


            }
            System.out.println("The letter " + str.charAt(i) + " repeated for " + count + " times");
        }
    }
}