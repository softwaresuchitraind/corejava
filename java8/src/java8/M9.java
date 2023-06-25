package java8;

import java.util.function.Function;

public class M9
{
	public static void main(String[] args)
	{
		Function<String, Integer> f1 = s1->s1.length();
		System.out.println("Length of the String  ::#---"+f1.apply("Hello to all"));
		
		Function<String, String> f2 = s1->s1.replaceAll(" ", "");
		System.out.println("Length of the String  ::#---"+f2.apply(" to all"));
		
		Function<String, Integer> f3 = s1->s1.length() - s1.replaceAll(" ", "").length();
		System.out.println("Length of the String  ::#---"+f3.apply("Hello to all"));
	}
}
