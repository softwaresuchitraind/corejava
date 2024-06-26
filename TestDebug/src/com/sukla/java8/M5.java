package com.sukla.java8;
//Sort the element of Arraylist in decending order

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M5
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(1);
		System.out.println("Before Sorting"+ a);
		//Collections.sort(a,new NumberSort());
		//Collections.sort(a,(i,j)->i.compareTo(j));
		Collections.sort(a,(i,j)->(i>j)?-1:1);
		System.out.println("After Sorting"+ a);
		
	}
}
	class NumberSort implements Comparator<Integer>
	{
		@Override
		public int compare(Integer i, Integer j)
		{
			if(i>j)
			{
				return -1;
			}
			else if(i<j)
			{
				return 1;
			}
			return 0;
		}
	}

