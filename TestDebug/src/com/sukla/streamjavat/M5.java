package com.sukla.streamjavat;

import java.util.Arrays;

//letter count
public class M5
{
	public static void main(String[] args)
	{
		String arr[]= {"hello","mango","Hi","Hello"};
		Arrays.stream(arr).map(x->x+"--"+x.length()).forEach(System.out::println);
		
	}

}
