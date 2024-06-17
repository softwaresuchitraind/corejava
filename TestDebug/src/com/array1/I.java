package com.array1;
//find out min value from all even indexed element
public class I
{
	public static void main(String[] args)
	{
		int arr[] = {5,2,3,4,5,6};
		int min =arr[0];
		for(int i=2;i<arr.length;i+=2)
		{
			if(arr[i]<min)
			{
				min= arr[i];
			}
		}
		System.out.println(min);
	}

}
