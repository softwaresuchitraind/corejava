package com.sukla.array;
/**
 * Linear Search for sorted Array
 * */
public class M3
{
	public static void main(String[] args)
	{
		int []ar = {-1,2,5,10,20,30,35,45,60};
		boolean lin=linerSearchSorted(ar,7,15);
		System.out.println(lin);
	}

	private static boolean linerSearchSorted(int[] ar, int n, int key)
	{
		for(int i =0; i<n;i++)
		{
			if(key==ar[i])
				return true;
			if(ar[i]>key)
				return false;
		}
		System.out.println("exit from loop");
		return false;
	}
}
