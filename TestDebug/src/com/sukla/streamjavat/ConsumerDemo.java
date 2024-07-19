package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo 
{
	public static void main(String[] args)
	{
		Consumer<Integer> c = x -> System.out.println(x);
		c.accept(10);
		
		List<Integer> asList = Arrays.asList(10,20,30,40);
		asList.stream().forEach(c);
		asList.stream().forEach(x -> System.out.println(x));
	}
}
