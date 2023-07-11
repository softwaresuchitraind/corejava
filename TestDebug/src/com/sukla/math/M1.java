package com.sukla.math;

import java.util.Scanner;

/*
 * Factorial of a number 0<n<20
 * Input-4 Output-24
 * */
public class M1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
}
