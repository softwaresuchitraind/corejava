package stream;

import java.util.ArrayList;
import java.util.List;

public class M7
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("suchitra");
		list.add("suchitra");
		list.add("kumar");
		list.add("sukla");
		list.add("archan");
		list.add("kalu");
		list.add("kalu");
		list.add("sam");
		
		//list.stream().distinct().forEach(System.out::println);
		//list.stream().limit(4).forEach(System.out::println);
		list.stream().skip(4).forEach(System.out::println);
	}
}
