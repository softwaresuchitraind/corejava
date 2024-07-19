package com.sukla.streamjavat;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class M12
{
	public static void main(String[] args)
	{
		String s ="java concept of the day";
		 Optional<Entry<Character, Long>> first = s.chars().mapToObj(x->(char)x)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()==1)
		.findFirst();
		 
		 first.ifPresent(System.out::println);
		
		
		
	}
}
