package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class M15
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("suchitra");
		list.add("kumar");
		list.add("sukla");
		
		Spliterator<String> spliterator = list.spliterator();
		spliterator.forEachRemaining(System.out::println);
	}
}
