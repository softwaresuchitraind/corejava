package com.array1;
//find out all sum of all even indexed element in an array
public class G
{
	public static void main(String[] args)
	{
		int arr[]= {2,3,4,5,6,8};
		int sum=0;
		for(int i=0;i<arr.length;i+=2)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of even insexed ::" +sum);
	}
}
