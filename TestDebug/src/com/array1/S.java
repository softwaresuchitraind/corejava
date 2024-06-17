package com.array1;
//Find the min value from the 2nd half if total no of element is odd,mid element is in 2nd half
public class S
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,5,40,0,60,70,80,9};
		int min= arr[(arr.length/2)];
		for(int i=(arr.length/2)+1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
