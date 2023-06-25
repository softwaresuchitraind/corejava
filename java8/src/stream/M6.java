package stream;

import java.util.Arrays;
import java.util.List;

public class M6
{
	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("java","adv java");
		List<String> list2 = Arrays.asList("AWS","xyz");
		List<String> list3 = Arrays.asList("mno","pqr");
		List<List<String>> list4 = Arrays.asList(list1,list2,list3);
		list4.stream().flatMap(x->x.stream()).forEach(System.out::println);
		
	}
}
