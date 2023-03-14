package com.arrays;

import java.util.*;

public class ArrangeInAscending {
    public static void main(String[] args) {


        Integer[] arr = {2, 4, 7, 96, 4, 3};

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        Collections.sort(list);

    }
}