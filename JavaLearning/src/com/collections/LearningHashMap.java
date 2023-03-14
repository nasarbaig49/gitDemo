package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearningHashMap {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<String, String>();
        // Map<String, String> capitals2 = new HashMap<String, String>();
        capitals.put("Telangana", "Hyderabad");
        capitals.put("Andhra", "Amaravati");
        capitals.put("TamilNadu", "Chennai");
        capitals.put("", "Hyderabad");

        System.out.println(capitals);

        capitals.replace("Telangana", "Hyd");
        System.out.println(capitals);
        capitals.remove("TamilNadu");
        System.out.println(capitals);
        System.out.println(capitals.values());
        // HashMap<String,String> capitals2= (HashMap<String, String>) capitals.clone();
        capitals.put("Telangana", "Hyderabad");
        System.out.println(2);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);


    }}