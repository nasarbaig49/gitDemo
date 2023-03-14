package com.collections;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        Integer[] arr={3,4,2,5,2};

        List<Integer> list = new ArrayList<Integer>();
        list.addAll(List.of(34,34,3,2,2,3));
        System.out.println(list);
        list.addAll(List.of(arr));

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<Integer> set=new HashSet<Integer>(list);


        Map<String,String> map=new HashMap<String,String>();
        map.put("s","sd");
        map.put("e","sd");
        map.put("r","sd");
        System.out.println(map.entrySet());

        for(String k:map.keySet()){
            System.out.println(k+" "+map.get(k));
        }

    }
}