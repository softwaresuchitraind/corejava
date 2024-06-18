package com.array1;
//Swap two given indexed element of an Array
public class V5
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		System.out.println("Initial Array Content");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		int temp = arr[2];
		arr[2]=arr[0];
		arr[0]=temp;
		System.out.println("Final Array Content :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		
	}
}
