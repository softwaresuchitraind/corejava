import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

// Count the number of occurance in a given String
// {Hellow how are you}
public class NumberOfWordsOccurance
{
	public static void main(String[] args)
	{
		String str = "Hello how are you how how you";
		String[] newStr = str.split("\\s+");
		
		Map<String, Long> wordOccurances = Arrays.stream(newStr)
				.collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		
		for(Map.Entry<String, Long> entry : wordOccurances.entrySet())
		{
			String word = entry.getKey();
			Long count = entry.getValue();
			System.out.println(word+ ":"+count);
							
		}
	}
}
