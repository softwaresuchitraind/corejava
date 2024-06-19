package com.array1;
//Reverse only even indexed element
public class V11
{
	public static void main(String[] args)
	{
		int x[] = {0,1,2,3,4,5,6,7,8};
		System.out.println("Initial Array Content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+", ");
		}
		System.out.println();
		int lastevenIndex = x.length%2==0?x.length-2:x.length-1;
		for(int i=0;i<lastevenIndex/2;i+=2)
		{
			x[i]=x[i]+x[x.length-1-i];
			x[x.length-1-i]=x[i]-x[x.length-1-i];
			x[i]=x[i]-x[x.length-1-i];
			
		}
		System.out.println("Final Array Content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+", ");
		}
	}
}
