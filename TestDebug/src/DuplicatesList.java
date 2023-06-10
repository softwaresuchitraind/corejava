import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,5,5,5,10,1,13));
		System.out.println(list);
		List<Integer> list1 =list.stream().distinct().collect(Collectors.toList());
		System.out.println(list1);
	}
}
