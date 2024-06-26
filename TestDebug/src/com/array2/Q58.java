package com.array2;
//Find out missed element of a given Array between min and max
public class Q58
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
		int min=x[0],max=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min = x[i];	
			}
			if(x[i]>max)
			{
				max=x[i];
			}

		}
	}

}
