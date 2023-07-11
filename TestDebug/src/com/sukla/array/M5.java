package com.sukla.array;

import java.util.Arrays;
import java.util.Scanner;

public class M5
{
	public static void main(String[] args)
	{
		System.out.println("Enter size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			int m = sc.nextInt();
			arr[i]=m;
			//System.out.println(i+" "+Arrays.toString(arr));
		}
		
		for(int i=0;i<n;i++)
		{
			int key=arr[i];
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[j]==key)
					count++;
			}
			if(count==1)
			{
				System.out.println(key);
			}
			
		}
	}
}
