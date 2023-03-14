package com.java.learning;

public class CompareObjs {
    int x;
    int y;



    CompareObjs(int x,int y){

        this.x=x;
        this.y=y;
    }

    boolean equalsTo(CompareObjs o){

        return(o.x==x && o.y==y);
    }


    public static void main(String[] args){
        CompareObjs obj1=new CompareObjs(1,2);
        CompareObjs obj2=new CompareObjs(1,2);
        CompareObjs obj3=new CompareObjs(2,3);

        System.out.println(obj1.equalsTo(obj2));
        System.out.println(obj1.equalsTo(obj3));
    }
}
