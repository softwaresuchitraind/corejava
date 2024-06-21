package com.sukla.java8;

import java.util.function.Predicate;

public class PredicateExample
{
	public static void main(String[] args)
	{
		Predicate<Integer> p=i->i>10;
		System.out.println(p.test(12));
		System.out.println(p.test(5));
	}

}
