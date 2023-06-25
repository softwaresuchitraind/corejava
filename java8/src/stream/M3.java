package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Java program to filter a List Whose name starts with S
 * */
public class M3
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("suchitra");
		list.add("kumar");
		list.add("sukla");
		list.add("such");
		
		list.stream().filter(x->x.startsWith("s")).forEach(System.out::println);
	}
}
