package com.array1;
//Read all the elements 2nd half of an Array in Reverse order
public class U2
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7};
		for(int i=arr.length-1;i>=arr.length/2;i--)
		{
			System.out.print(arr[i]+",");
		}
	}

}
