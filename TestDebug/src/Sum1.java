import java.util.Arrays;
import java.util.List;

public class Sum1
{
	public static void main(String[] args)
	{
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Integer reduce = asList.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce);
	}

}
