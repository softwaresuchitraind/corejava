package stream;

import java.util.stream.Stream;

/*
 * Filter numbers which are greater than 60
 * **/

public class M2
{
	public static void main(String[] args)
	{
		//Stream<Integer> of = Stream.of(20,61,45,100,500,800);
		//Stream<Integer> filter = of.filter(x->x>60);
		//filter.forEach(y->System.out.println(y));
		Stream.of(20,51,45,100,500).filter(x->x>60).forEach(System.out::println);
	}
}
