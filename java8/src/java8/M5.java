package java8;

import java.util.ArrayList;
import java.util.Collections;

public class M5
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(50);
		list.add(45);
		list.add(5);
		list.add(500);
		System.out.println("Before Sorting"+list);
		//Collections.sort(list);
		Collections.sort(list,(a,b)->(a>b?-1:a<b?1:0));
		System.out.println("After Sorting"+list);
		
	}
}
