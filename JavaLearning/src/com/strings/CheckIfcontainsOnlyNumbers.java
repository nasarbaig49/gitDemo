package com.strings;

public class CheckIfcontainsOnlyNumbers {
    public static void main(String[] args) {
        String str="232w434";
        String str2="";
        str2=str.replaceAll("[0-9]","");
        if(str2.isBlank()){
            System.out.println("contains only numbers");
        }
    }
}
