package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class M2
{
	public static void main(String[] args)
	{
		String arr[]= {"hello","mango","Hi","Hello"};
		/*
		Map<String, Long> collect = Arrays.stream(arr).map(String::toLowerCase)
				.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		collect.forEach((x,y)->System.out.println(x+ " : "+y));*/
		Arrays.stream(arr).map(String::toLowerCase)
				.collect(Collectors.groupingBy(x->x,Collectors.counting()))
				.forEach((x,y)->System.out.println(x+ " : "+y));
				
		
	}

}
