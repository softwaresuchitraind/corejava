package com.array1;
//Find the average value in an int array
public class F
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		double avg = (double)sum/arr.length;
		System.out.println("Average of an Array is  "+avg);
	}
}