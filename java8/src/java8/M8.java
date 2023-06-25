package java8;

import java.util.function.BiConsumer;

public class M8
{
	public static void main(String[] args)
	{
		BiConsumer<String,String> b1 = (a,b)->System.out.println(a+b);
		b1.accept("hello", "world");
	}
}
