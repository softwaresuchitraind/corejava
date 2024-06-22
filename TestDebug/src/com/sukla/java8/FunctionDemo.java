package com.sukla.java8;

import java.util.function.Function;

public class FunctionDemo
{
	public static void main(String[] args)
	{
		Function<String, Integer> f1 =(name)-> name.length();
		System.out.println(f1.apply("Suchitra"));
		System.out.println(f1.apply("Sukla"));
		
	}
}
