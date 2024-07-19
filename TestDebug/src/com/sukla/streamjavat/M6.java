package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class M6
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(10,20,50,30,40,70,80);
		//List<Integer> collect = numbers.stream().filter(x->x>30).filter(x->x<80).collect(Collectors.toList());
		
		Predicate<Integer> filter1=(x)->x>30;
		Predicate<Integer> filter2=(x)->x<70;
		//List<Integer> collect = numbers.stream().filter(filter1.and(filter2)).collect(Collectors.toList());
		List<Integer> collect = numbers.stream().filter(filter1.negate()).collect(Collectors.toList());
		System.out.println(collect);
	}
}
