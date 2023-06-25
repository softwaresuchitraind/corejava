package java8;

import java.util.function.Consumer;

public class ConsumerDemo
{
	public static void main(String[] args)
	{
		Consumer<String> consumer1 = (arg)->System.out.println(arg+ " is My Name");
		Consumer<String> consumer2 = (arg)->System.out.println(arg+ " Country");
		consumer1.andThen(consumer2).accept("Hello");
	}
}
