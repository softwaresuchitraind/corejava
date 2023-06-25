package com.sukla.practice;

import java.math.BigInteger;

/*
 * Sum of Digits
 * **/
public class M3
{
	public static void main(String[] args)
	{
		long n =123456789678654l;
		long sum =digitsum(n);
		//System.out.println(sum);
		String st = "123";
		long sum1= digitsumstr(st);
		System.out.println(sum1);
	
	}

	private static long digitsumstr(String st)
	{
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
			char c = st.charAt(i);
			sum=sum+c-48;
					
		}
		return sum;
	}

	private static long digitsum(long n)
	{
		long sum =0;
		while(n>0)
		{
			long r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}
}
