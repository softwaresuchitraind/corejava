package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class M8
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9);
		//list.stream().map(x->x*2).forEach(System.out::println);
		
		Function<Integer,Integer> f1 = (x-> {
			System.out.println("Function 1 printing");
			return x*2;
		});
		Function<Integer,Integer> f2 = (x-> {
			System.out.println("Function 2 printing");
			return x+5;
		});
		
		//list.stream().map(f1.andThen(f2)).forEach(System.out::println);
		list.stream().map(f1.compose(f2)).forEach(System.out::println);
	}
}
