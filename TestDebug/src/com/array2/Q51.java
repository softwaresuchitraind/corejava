package com.array2;

import java.util.Arrays;

// Remove specified indexed elemnt from the given Array
public class Q51
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
		//Remove elements from index 4
		
		for(int i=4;i<x.length-1;i++)
		{
			x[i]=x[i+1];
		}
		System.out.println(Arrays.toString(x));
		int y[] = new int[x.length-1];
		
		for(int i=0;i<y.length;i++)
		{
			y[i]=x[i];
		}
		System.out.println("Final Array Content");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ,");
		}
		
	}
}
