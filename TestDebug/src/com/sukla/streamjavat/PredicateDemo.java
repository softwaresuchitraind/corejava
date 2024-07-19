package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo
{
	public static void main(String[] args)
	{
		Predicate<Integer> predicate = t -> t%2==0;
		System.out.println(predicate.test(20));
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		asList.stream().filter(t -> t%2==0).forEach(x->System.out.println("print even :"+x));
	}
}
