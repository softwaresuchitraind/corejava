import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortedList
{
public static void main(String[] args)
	{
	//Arrays.asList(10,5,6,60,40,50,40).stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
	//Arrays.asList(10,5,6,60,40,50).stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
	//Arrays.asList(10,5,6,60,40,50).stream().sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);
	Optional<Integer> first = Arrays.asList(10,5,6,60,40,50).stream().sorted().distinct().skip(1).findFirst();
	System.out.println(first.get());
	
	}
}
