package com.sukla.practice;

import java.util.Arrays;

public class M4
{
	public static void main(String[] args)
	{
		
		Arrays.asList("hello","hello","world").stream().distinct().forEach(System.out::println);
	}
}
