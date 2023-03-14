package com.java;
 class duplicate{
     public void dup(int arr[]){

         for(int i=0;i<arr.length;i++){
             int count=0;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                     count++;
                 }
             }
             if(count>0){
                 System.out.println(arr[i]);
             }
         }
     }


}
public class FIndDuplicatesInArray extends duplicate{
    static int arr[];
     FIndDuplicatesInArray(int arr[]){
         this.arr=arr;

     }
    public static void main(String[] args){
        FIndDuplicatesInArray array=new FIndDuplicatesInArray(new int[] {2,4,2,5,66,87,2});

        array.dup(arr);


    }
}
