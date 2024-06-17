package com.array1;
//Find the min value from the 1st half if total no of element is even
public class R1
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,5,40,50,60,70,80};
		int min= arr[0];
		for(int i=1;i<arr.length/2;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
