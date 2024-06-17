package com.array1;
//Find Sum of all the elements in a given Array
public class A
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum :"+sum);
	}
}
