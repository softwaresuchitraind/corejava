package com.array2;
// Remove range of elements from the given Array
public class Q54
{
	public static void main(String[] args)
	{
		int x[]= {5,2,8,3,10,6,1,7,0,4};
		System.out.println("Initial Array ::");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ,");
		}
		System.out.println();
		int fromIndex=4;
		int endIndex=7;
		int totalRange=endIndex-fromIndex;
		for(int i=fromIndex;i<x.length-totalRange;i++)
		{
			x[i]=x[i+totalRange];
		}
		int y[] = new int[x.length-totalRange];
		for(int i=0;i<y.length;i++)
		{
			y[i]=x[i];
		}
		System.out.println("Final Array ::");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ,");
		}
		
	}
}
