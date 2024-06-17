package com.array1;
//find out all sum of all odd indexed element in an array
public class H
{
	public static void main(String[] args)
	{
		int arr[]= {2,3,4,5,6,8};
		int sum=0;
		for(int i=1;i<arr.length;i+=2)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of odd insexed ::" +sum);
	}
}
