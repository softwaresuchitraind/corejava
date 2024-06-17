package com.array1;
//Read all the elements 1st half of an Array in Reverse order
public class U1
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6};
		for(int i=(arr.length/2)-1;i>=0;i--)
		{
			System.out.print(arr[i]+",");
		}
	}

}
