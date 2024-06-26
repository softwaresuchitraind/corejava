package com.sukla.java8;

import java.util.Arrays;

public class M15
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5};
		
		int reduce = Arrays.stream(arr).reduce(0,(a,b)->a+b);
		System.out.println(reduce);
	}
}
