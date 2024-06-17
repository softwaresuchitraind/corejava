package com.array1;
//2nd max element of Array
public class E
{
	public static void main(String[] args)
	{
		int arr[] = {20,2,3,5,6,34,56,60};
		int max1=arr[0],max2=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]> max1)
			{
				max2=max1;
				max1=arr[i];
				
			}
			else if(arr[i]>max2)
			{
				max2=arr[i];
			}
			else if((max1==max2)&& (arr[i] < max2))
			{
				max2 =arr[i];
			}
		}
		System.out.println(max2);
	}

}
