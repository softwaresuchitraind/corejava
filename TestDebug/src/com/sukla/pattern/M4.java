package com.sukla.pattern;
/*
 * 	A
 * 	AB
 * 	ABC
 * 	ABCD
 * 	ABCDE
 * 
 * 
 * */

import java.util.Scanner;

public class M4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int r=1;r<=n;r++)
		{
			char ch='A';
			for(int c=1;c<=r;c++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			ch--;
			for(int k=1;k<=r-1;k++)
			{
				System.out.print(--ch+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
