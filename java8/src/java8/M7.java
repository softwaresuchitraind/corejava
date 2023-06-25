package java8;

import java.util.function.Predicate;

public class M7
{
	public static void main(String[] args)
	{
		Predicate<Integer> p = (x->x>10);
		System.out.println(p.test(10));
		System.out.println(p.test(100));
		
		String arr[] = {"kumar","kartik","keshav","suchitra"};
			Predicate<String> p1 = (s->s.charAt(0)=='k');
		for(String name : arr)
		{
			if(p1.test(name))
			{
				System.out.println(name);
			}
		}
		
	}
}
