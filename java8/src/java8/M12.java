package java8;

import java.util.function.BiFunction;

public class M12
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> bi=(a,b)->a+b;
		System.out.println(bi.apply(10, 20));
	}
}
