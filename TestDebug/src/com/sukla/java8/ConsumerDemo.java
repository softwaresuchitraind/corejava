package com.sukla.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo
{
	public static void main(String[] args)
	{
		Consumer<String> consumer=(name)->System.out.println(name+" , Good Morning");
		consumer.accept("Suchitra");
		consumer.accept("Sukla");
		
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,60);
		numbers.forEach(x->System.out.print(x+" ,"));
	}

}
