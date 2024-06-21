package com.array2;
//Remove all odd indexed element from a given Array
public class Q55
{
	public static void main(String[] args)
	{
		int x[] = {3,10,10,5,10,10,4,10,10,10};
		System.out.println("Initial Array ::");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ,");
		}
		System.out.println();
		int min=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		for(int i=1;i<x.length;i++)
		{
			if(i%2==1)
			{
				x[i]=min-1;
			}
		}
		int occurances=0;
		for(int i=1;i<x.length-occurances;i++)
		{
			if(x[i]==min-1)
			{
				for(int j=i;j<x.length-occurances-1;j++)
				{
					x[j]=x[j+1];
				}
				occurances++;
			}
		}
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
	}

}
