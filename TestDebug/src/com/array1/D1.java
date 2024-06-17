package com.array1;
//2nd min element of Array
public class D1
{
	public static void main(String[] args)
	{
		int arr[] = {20,2,3,5,6,34,56,60};
		int min1=arr[0],min2=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min1)
			{
				min2=min1;
				min1=arr[i];
				
			}
			else if(arr[i]<min2)
			{
				min2=arr[i];
			}
			else if((min1==min2)&& (arr[i] >min2))
			{
				min2 =arr[i];
			}
		}
		System.out.println(min2);
	}

}
