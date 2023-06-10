import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author sUchitra
 * Three List are there have to find Unique elements Amoung the List
 */
public class ListToSet
{
	public static void main(String[] args)
	{
		List<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(20);
		a1.add(5);
		List<Integer> a2 = new ArrayList<>();
		a2.add(10);
		a2.add(200);
		a2.add(100);
		a2.add(5);
		a2.add(5);
		List<Integer> a3 = new ArrayList<>();
		a3.add(100);
		a3.add(200);
		a3.add(10);
		a3.add(200);
		a3.add(5);
	List<Integer> a4=uniquElements(a1,a2,a3);
	System.out.println(a4);
	}
	
	public static List<Integer> uniquElements(List<Integer> a1,List<Integer> a2, List<Integer> a3)
	{
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(a1);
		set1.addAll(a2);
		set1.addAll(a3);
		return new ArrayList<>(set1);
	}
}
