package com.array1;

//Find the 2nd minimum element in an Array
public class D
{
	public static void main(String[] args)
	{
		int arr[] = {5,10,3,23,45,65,45};
		int min =arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min =arr[i];
			}
		}
		int ndMin=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<ndMin&& arr[i]!=min)
			{
				ndMin =arr[i];
			}
		}
		System.out.println("2nd Min ::"+ndMin);
		
	}

}
