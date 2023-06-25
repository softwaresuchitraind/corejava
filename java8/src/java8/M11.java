package java8;

import java.util.function.Function;

public class M11
{
	public static void main(String[] args)
	{
		Function<String,String> f1 = s1->s1.toUpperCase();
		Function<String,String> f2 = s1->s1.substring(0, 5);
		
		//System.out.println(f1.apply("suchitra"));
		//System.out.println(f2.apply("suchitra"));
		System.out.println(f1.andThen(f2).apply("suchitra"));
		System.out.println(f1.compose(f2).apply("suchitra"));
		
	
	}
}

/*
 * Shift+Home/Shift+End-select a line
 * Ctrl+Alt+downArrow-to dupliccate line
 * Alt+upArrow/Alt+downArrow- to move line
 * */
