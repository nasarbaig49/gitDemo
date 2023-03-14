package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {
    public static void main(String args[]){
        List arr=new ArrayList<>();
        List arr2=new ArrayList<>();
        arr.add(10);
        arr.add(2);
        arr.add("sd");
        arr.add("Nas");

        arr.add(4,"Bia");
        arr2.addAll(arr);
        System.out.println(arr2);
        arr.clear();
        System.out.println(arr2.contains('b'));
        arr2.equals(arr);
        arr2.add(10);
        System.out.println(arr2);
      //  arr2.removeAll(Integer.valueOf(10));
        System.out.println(arr2);


        //Convert array to list
        Integer[] arr3={2,4,6,8,3};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr3));


    }
}
