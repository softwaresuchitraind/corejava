package com.array1;
//Find out sum of elements in the 2nd half of the Array--middle element in the 2nd half
public class P
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60,70};
		int sum=0;
		/*
		for(int i=arr.length-1;i>arr.length/2;i--)
		{
			sum+=arr[i];
		}
		*/
		for(int i=(arr.length/2);i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
