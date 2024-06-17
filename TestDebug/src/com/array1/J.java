package com.array1;
//find out max value from all odd indexed element
public class J
{
	public static void main(String[] args)
	{
		int arr[] = {5,2,3,4,5,6,34,5,34};
		int max =arr[1];
		for(int i=3;i<arr.length;i+=2)
		{
			if(arr[i]>max)
			{
				max= arr[i];
			}
		}
		System.out.println(max);
	}

}
