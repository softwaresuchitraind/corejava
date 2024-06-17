package com.array1;
//Find out sum of elements in the 1st half of the Array
public class N
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60,70};
		int sum=0;
		for(int i=0;i<=arr.length/2;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
