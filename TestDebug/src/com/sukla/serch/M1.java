package com.sukla.serch;

//Binary search using Recursion
public class M1
{
	public static void main(String[] args)
	{
		int arr[] =
		{ 5, 6, 7, 8, 10, 40 };
		int target = 10;
		int i = binarySearch(arr, target, 0, arr.length - 1);
		if (i == -1)
		{
			System.out.println("Element is not found");
		} else
		{
			System.out.println("Element is found at" + i);
		}
	}

	private static int binarySearch(int[] arr, int target, int left, int right)
	{
		if (left <= right)
		{
			int mid = left + (right - left)/ 2;
			if (arr[mid] == target)
			{
				return mid;
			}
			else if (target<arr[mid])
			{
				return binarySearch(arr, target,left, mid);
			} 
			return binarySearch(arr, target, mid + 1, right);
			
		}
		return -1;

	}
}
