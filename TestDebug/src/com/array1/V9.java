package com.array1;
//Reverse only the 1st half of the given Array
public class V9
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
		
		for(int i=0;i<(arr.length/2)/2;i++)
		{
			
			arr[i]=arr[i]+arr[arr.length/2-i-1];
			arr[arr.length/2-i-1]=arr[i]-arr[arr.length/2-i-1];
			arr[i]=arr[i]-arr[arr.length/2-i-1];
		}
		System.out.println("Final Array Content");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
}
