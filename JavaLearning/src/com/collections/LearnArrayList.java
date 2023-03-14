package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearnArrayList {
    public static void main(String[] args){

        List<String> list1=new ArrayList<String>();

        list1.add("sds");
        list1.add("sds");
        list1.add("24");

        System.out.println(list1);
        for(String i:list1){
            System.out.println(i);
        }
        Iterator itr=list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        ListIterator itrl=list1.listIterator();
        while(itrl.hasNext()){
            System.out.println(itrl.next());
        }
    }
}