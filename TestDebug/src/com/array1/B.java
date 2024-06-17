package com.array1;
//Find the minimnum element in an Array
public class B
{
	public static void main(String[] args)
	{
		int arr[] = {10,3,5,78,34,100};
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum element:: "+min);
	}

}
