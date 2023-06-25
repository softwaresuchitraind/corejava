import java.util.Comparator;
import java.util.HashMap;

/**
 * Calculate 2nd Highest Salary from a Map
 * */
public class SeconHighestSalary
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Suchitra", 500);
		map.put("Kanha", 100);
		map.put("Hello", 800);
		map.put("Hi", 400);
		map.put("Self", 800);
		
		Integer secondHighestSalary = map.values().stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(-1);
		System.out.println(secondHighestSalary);
	}
}
