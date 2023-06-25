package stream;

import java.util.ArrayList;
import java.util.List;

public class M5
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("suchitra");
		list.add("kumar");
		list.add("sukla");
		
		//list.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		//list.stream().map(x->x.toUpperCase() +"::" +x.length()).forEach(System.out::println);
		//list.stream().mapToInt(n->n.length()).forEach(System.out::println);
		list.stream().filter(x->x.startsWith("k")).map(k->k +" "+k.length() ).forEach(System.out::println);
	}
}
