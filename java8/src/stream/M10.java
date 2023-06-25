package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class M10
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("suchitra");
		list.add("kumar");
		list.add("sukla");
		list.add("archan");
		list.add("kalu");
		list.add("sam");
		
		Map<String, Integer> collect = list.stream().collect(Collectors.toMap(x->x, x->x.length()));
		System.out.println(collect);
	}
}
