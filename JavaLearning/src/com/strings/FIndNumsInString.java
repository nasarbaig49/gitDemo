package com.strings;

public class FIndNumsInString {
    public static void main(String[] args) {
        String str="Nasar1Biag2";
        String newStr="";
       // char[] arr=str.toCharArray();
        //for(char c:arr){
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                newStr=newStr+str.charAt(i);
            }

        }
        System.out.println(newStr);
    }
}
