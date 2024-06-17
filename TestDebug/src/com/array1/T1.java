package com.array1;
//Find max of 1st half of tthe element if total is odd middle is 2st half
public class T1
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,5,40,90,60,70,80,9};
		int max=arr[0];
		for(int i=1;i<(arr.length/2);i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
