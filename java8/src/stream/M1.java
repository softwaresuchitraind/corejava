package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class M1
{
	public static void main(String[] args)
	{
		Stream<Integer> of = Stream.of(1,2,3,5,14,5,6);
		
		List<String> list = new ArrayList<>();
		list.add("suchitra");
		list.add("kumar");
		list.add("sukla");
		
		Stream<String> stream = list.stream();
	}
}
