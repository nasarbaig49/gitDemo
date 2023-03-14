package com.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr={1,34,5,1,5,6};
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>(Arrays.asList(arr));
        System.out.println(set);



    }
}
