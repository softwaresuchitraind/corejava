package com.sukla.java8;

import java.util.function.BiFunction;

public class BiFunctionEx
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> bif=(a,b)->a+b;
		System.out.println(bif.apply(10, 20));
	}

}
