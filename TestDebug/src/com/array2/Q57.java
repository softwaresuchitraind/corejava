package com.array2;

import com.array1.C;

//Remove duplicates from an Array
public class Q57
{
	public static void main(String[] args)
	{
		int x[]= {10,20,10,20,14,14,5,6,4,3,50,6};
		System.out.println("Initial Array------");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+", ");
		}
		System.out.println();
		int count=0;
		for(int i=0;i<x.length-count;i++)
		{
			for(int j=i+1;j<x.length-count;j++)
			{
				if(x[i]==x[j])
				{
					for(int k=j;k<x.length-1;k++)
					{
						x[k]=x[k+1];
					}
					j--;
					count++;
				}
			}
		}
		int y[] = new int[x.length-count];
		for(int i=0;i<y.length;i++)
		{
			y[i]=x[i];
		}
		System.out.println("Final Array------");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+", ");
		}
	}
}
