package com.sukla;

import java.util.ArrayList;
import java.util.List;

public class Demo
{
	public static void main(String[] args)
	{
		List l1 = new ArrayList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		System.out.println(l1);
		List l2 = new ArrayList();
		l2.add(100);
		l2.add(200);
		l2.add(600);
		//l2.addAll(0,l1);
		l2.retainAll(l1);
		System.out.println(l2);
		
//		List l = new ArrayList();
//		l.add(100);//add object at end of the position
//		l.add(200);
//		l.add(300);
//		l.add(400);
//		l.add(400);
//		l.add(1000);
//		l.add(null);
//		System.out.println(l);
//		System.out.println(l.size());
//		l.clear();
//		System.out.println(l);
//		//l.add(0,500);
		//System.out.println(l);
		//l.add(3,700);
		//System.out.println(l);
		//l.set(0, 50);
		/*
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
		
		System.out.println(l.contains(700));
		System.out.println(l.contains(200));
		//System.out.println(l.get(100));
		System.out.println(l.indexOf(100));
		System.out.println(l.indexOf(400));
		System.out.println(l.lastIndexOf(400));
		*/
	}

}
