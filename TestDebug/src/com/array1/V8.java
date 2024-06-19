package com.array1;
//Reverse the elements of the array without using temp
public class V8
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,80,40,50,1100};
		System.out.println("Initial Array Content");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length/2;i++)
		{
			
			arr[i]=arr[i]+arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[i]-arr[arr.length-i-1];
			arr[i]=arr[i]-arr[arr.length-i-1];
		}
		System.out.println("Final Array Content");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
}
