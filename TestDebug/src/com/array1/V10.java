package com.array1;
//Reverse only the 2nd half of the given Array
public class V10
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
		
		for(int i=(i=arr.length/2),j=0;i<(arr.length/2)+((arr.length-(arr.length/2))/2);i++,j++)
		{
			arr[i]=arr[i]+arr[arr.length-1-j];
			arr[arr.length-1-j]=arr[i]-arr[arr.length-1-j];
			arr[i]=arr[i]-arr[arr.length-1-j];
		}		
		System.out.println("Final Array Content");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
}
