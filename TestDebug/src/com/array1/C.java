package com.array1;
//Find the max element of an Array
public class C
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,3,50,80};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max element:: "+max);
	}

}
