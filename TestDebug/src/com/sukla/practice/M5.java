package com.sukla.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*distinct value form a String*/
public class M5
{
	public static void main(String[] args)
	{
		//String str="hello world";
		String arr[]= {"hello","world","hello"};
		//str.chars().mapToObj(c->String.valueOf((char)c)).distinct().collect(Collectors.toList()).forEach(System.out::println);
		//Map<String, Long> collect1 = str.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<String, Long> collect1 = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect1);
		
		//Map<Character, Long> collect2 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		//System.out.println(collect2);
	}
}
