package com.sukla.array;

import java.util.Iterator;

/**
 * Find the maximum element of an Array ?
 * */
public class M1
{
	public static void main(String[] args)
	{
		int ar[] = {5,4,10,7,2};
		int max=findMax(ar,5);
		System.out.println(max);
	}

	private static int findMax(int[] ar, int j)
	{
		int max = ar[0];
		for(int i=0;i<5;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
		}
		return max;
	}
}
