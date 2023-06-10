import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberofLetters
{
	public static void main(String[] args)
	{
		String str = "My Name is Suchitra Kumar Sukla";
		String[] split = str.split("");
		Map<String,Long> map =Arrays.stream(split).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
		for(Map.Entry<String, Long> map1 : map.entrySet() )
		{
			String key = map1.getKey();
			Long value = map1.getValue();
			System.out.println(key +":"+value);
		}
	}
}
