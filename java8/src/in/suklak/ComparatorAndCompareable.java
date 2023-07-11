package in.suklak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndCompareable implements Comparator<Integer>
{
	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(9);
		l.add(7);
		
		System.out.println(l);//Insertion order
		
		//write a program to make the array list sorted(Ascending order)
		
		Collections.sort(l);
		System.out.println("sort method output"+l);//Ascending order
		Collections.sort(l,new ComparatorAndCompareable());
		System.out.println("sort two methos arg"+l);//Ascending order
		
	}
	
	public int compare(Integer x, Integer y)
	{
				 return (x < y) ? 1 : ((x == y) ? 0 : -1);
	}
}
