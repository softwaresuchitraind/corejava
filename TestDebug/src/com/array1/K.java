package com.array1;
//find out average of all even indexed element
public class K
{
	public static void main(String[] args)
	{
		int arr[] = {5,2,3,4,5,6,34,5,34};
		int sum=0;
		for(int i=0;i<arr.length;i+=2)
		{
			sum+=arr[i];
		}
		int count=arr.length/2==0?arr.length/2:(arr.length/2)+1;
		System.out.println("Average of even indexed::" +(double)sum/count);
		
	}
		

}
