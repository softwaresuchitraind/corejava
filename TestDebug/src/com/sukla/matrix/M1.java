package com.sukla.matrix;

import java.util.Scanner;

public class M1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r= sc.nextInt();
		int c= sc.nextInt();
		int mat[][] = new int[r][c];
		int totalElement= r*c;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				mat[i][j]= sc.nextInt();
			}
		}
		int zero=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				if(mat[i][j]==0)
					zero++;
			}
		}
		
		int nonZero= totalElement-zero;
		if(nonZero>=0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
