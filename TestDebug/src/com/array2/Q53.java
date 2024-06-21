package com.array2;

import java.util.Arrays;

//Remove all occurances of Specified element
public class Q53
{
	public static void main(String[] args)
	{
		int x[] = {3,10,10,5,10,10,4,10,10,10};
		//remove 10
		System.out.println("Initial Array ::");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ,");
		}
		System.out.println();
		System.out.println("Item to remove :: 10");
		int occurances =0;
		for(int i=0;i<x.length-occurances;i++)
		{
			if(x[i]==10)
			{
				for(int j=i;j<x.length-1;j++)
				{
					x[j]=x[j+1];
					System.out.print(x[j]+" ,");
				}
				occurances++;
				i--;
			}
			
		}
		System.out.println();
		System.out.println("x Array:"+Arrays.toString(x));
		int y[] = new int[x.length-occurances];
		for(int i=0;i<y.length;i++)
		{
			y[i]=x[i];
		}
		System.out.println("Final Array ::");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ,");
		}
		System.out.println();
		
	}
		

}
