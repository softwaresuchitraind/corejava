package com.sukla.practice;

import java.util.Scanner;

/**
 * 
 * @author Suchitra
 * First Repeted Character in a String
 * hello ------l
 */
public class M1
{
	public static void main(String[] args)
	{
		System.out.println("Enter a String ::");
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		outer :
		for(int i=0;i<=next.length()-1;i++)
		{
			char charAt = next.charAt(i);
			
			for(int j=1;j<=next.length()-1;j++)
			{
				if(charAt==next.charAt(j))
				{
				System.out.println("First repeating chracter ::" +j);
				break outer;
			}
		}
	}
	}
}
