package com.sukla.streamjavat;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

//First repeating charcter
public class M4
{
	public static void main(String[] args)
	{
		String s = "hello";
		Set<Character> set = new HashSet<>();
		IntStream.range(0, s.length())
				 .mapToObj(s::charAt)
				 .filter(ch->!set.add(ch))
				 .findFirst().ifPresent(x->System.out.println("First Repeating char ::"+x));
	}
}
