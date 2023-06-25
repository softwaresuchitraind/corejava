package com.sukla.array;
/**
 * Linear Search
 * */
public class M2
{
	public static void main(String[] args)
	{
		int []ar = {5,2,10,6,-1,4,6};
		boolean lin=ls(ar,7,55);
		System.out.println(lin);
	}

	private static boolean ls(int[] ar, int n, int key)
	{
		for(int i =0; i<n;i++)
		{
			if(key==ar[i])
				return true;
		}
		return false;
	}
}
