package com.sukla.streamjavat;

import java.util.Arrays;

//Removing Duplicates
public class M3
{
	public static void main(String[] args)
	{
		int arr[] = {10,15,8,49,25,98,98,32,15};
		Arrays.stream(arr).distinct().forEach(System.out::println);
	}
}
