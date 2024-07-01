import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LetterCount
{
	public static void main(String[] args)
	{
		String arr[]= {"hello","mango","Hi","Hello"};
		//Map<String,Long> collect1 = Arrays.stream(arr)
		     .collect(Collectors.groupingBy(Function.identity(),Function.identity().toString().length()));
		//System.out.println(collect1);
		int arrl[]= lengthofEachElement(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ "::"+arrl[i]);
		}
		//Arrays.stream(arrl).forEach(System.out::println);
	}

	private static int[] lengthofEachElement(String[] arr)
	{
		int[] array2 = Arrays.stream(arr).mapToInt(String::length).toArray();
		return array2;
	}
}
