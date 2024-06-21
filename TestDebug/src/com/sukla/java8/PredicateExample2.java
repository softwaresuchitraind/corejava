package com.sukla.java8;

import java.util.function.Predicate;

//print the names starts with a
public class PredicateExample2
{
	public static void main(String[] args)
	{
		String []names= {"hello","hunda","amit","asit"};
		
		Predicate<String> p = name -> name.charAt(0)=='a';
		for(String n:names)
		{
			if(p.test(n))
			{
				System.out.println(n);
			}
		}
	}
}
