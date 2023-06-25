package com.sukla.math;

public class Amstrong
{
	public static void main(String[] args)
	{
		int n=153;
		boolean arm= amstrongNum(n);
		System.out.println(arm);
	}

	private static boolean amstrongNum(int n)
	{
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			int r= n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		if(sum==temp)
			return true;
		else
			return false;
			
	}
}
