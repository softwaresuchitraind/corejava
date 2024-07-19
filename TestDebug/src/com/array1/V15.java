package com.array1;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

/*
1,0,3,0,5,0,2,0
Expected OP: 1,3,5,2,0,0,0,0
*/
public class V15{
 public static void main(String[] args) {
     
     int arr[]= {1,0,3,0,5,0,2,0};
     for(int i=0;i<arr.length/2;i++)
     {
         if(arr[i]==0)
         {
        	 /*
             int temp = arr[i];
             arr[i]=arr[arr.length-1-i];
             arr[arr.length-1-i]=temp;
             */
        	 arr[i]=arr[i]+arr[arr.length-1-i];
        	 arr[arr.length-1-i]=arr[i]-arr[arr.length-1-i];
        	 arr[i]=arr[i]-arr[arr.length-1-i];
         }
         
     }
     
     System.out.println("Final Array");
     for(int i=0;i<arr.length;i++)
     {
         System.out.println(arr[i]);
     }
 }
}