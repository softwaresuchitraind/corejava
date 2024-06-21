package com.array2;

import java.util.Arrays;

// update specified indexed elemnt from the given Array
public class Q52
{
	public static void main(String[] args)
	{ 
		int x[] = {10,20,50,40,30,35,80,90};
		System.out.println("Initial Array Content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ,");
		}
		System.out.println();
		//Remove elements from index 4 with 55
		
		x[4]=55;
		System.out.println("Final Array Content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ,");
		}
		
	}
}
