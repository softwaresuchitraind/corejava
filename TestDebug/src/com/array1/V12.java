package com.array1;
//right rotate by two lements
public class V12
{
	public static void main(String[] args)
	{
		int x[] = {10,20,30,40,50,60};
		System.out.println("Initial Array Content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+", ");
		}
		int temp1=x[x.length-1];
		int temp2=x[x.length-2];
		System.out.println();
		for(int i=x.length-1;i>1;i--)
		{
			x[i]=x[i-2];
		}
		x[0]=temp2;
		x[1]=temp1;
		System.out.println("Final Array Content");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+", ");
		}
	}
}
