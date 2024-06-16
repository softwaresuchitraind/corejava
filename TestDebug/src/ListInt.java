import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListInt
{
	public static void main(String[] args)
	{
		List<List<Integer>> list =new ArrayList<>(); 
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		list.add(list1);
		list.add(list2);
		list.add(list3);
		//System.out.println(list);
		
		 List<Integer> collect = list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		 //System.out.println(collect);
		 
		 List<String> list5 =Arrays.asList("hello","abc","india","duty","bangalore","hello","india","india");
		 Map<String, Long> collect2 = list5.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(collect2);
		
		
	}

}
