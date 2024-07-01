package com.sukla.string1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class M2
{
	public static void main(String[] args)
	{
		String s1 = "suchitra";
		String s2=reverse(s1);
		System.out.println(s2);
	}

	private static String reverse(String s1)
	{
		/*
		if(s1.isEmpty())
		{
			return "";
		}
		return reverse(s1.substring(1))+s1.charAt(0);*/
		
		return IntStream.rangeClosed(1, s1.length())
				.mapToObj(i->s1.charAt(s1.length()-i))
				.map(Object::toString)
				.collect(Collectors.joining());
		
		
	}
}
