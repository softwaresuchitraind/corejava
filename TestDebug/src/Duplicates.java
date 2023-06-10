import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * 
 * @author suchitra
 *	Removing duplicates from an Array
 */
public class Duplicates
{
	public static void main(String[] args)
	{
		int arr[] = {10,15,8,49,25,98,98,32,15};
		System.out.println("Origional Array");
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("Distinct Array");
		int[] array = Arrays.stream(arr).distinct().toArray();
		Arrays.stream(array).forEach(System.out::println);
	}
}
