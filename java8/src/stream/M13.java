package stream;

import java.util.stream.Stream;

public class M13
{
	public static void main(String[] args)
	{
		System.out.println("stream");
		Stream<Integer> s1 = Stream.of(12,45,30,56,60);
		
		s1.forEach(s->System.out.println(s+ " " +Thread.currentThread().getName()));
		System.out.println(" Parallel stream");
		Stream<Integer> s2 = Stream.of(12,45,30,56,60);
		s2.parallel().forEach(s->System.out.println(s+ " " +Thread.currentThread().getName()));
	}

}
