package com.sukla.streamjavat;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExample
{
	public static void main(String[] args)
	{
		Student st = new Student(1,"rajni",25,new int[] {90,80,85,70});
		Student st1 = new Student(2,"abc",30,new int[] {9,80,85,70});
		Student st2 = new Student(3,"def",45,new int[] {90,80,10,70});
		Student st3 = new Student(4,"ghi",60,new int[] {40,80,85,70});
		Student st4 = new Student(5,"jkl",25,new int[] {40,80,85,70});
		Student st5 = new Student(6,"mno",60,new int[] {60,80,85,80});
		
		List<Student> list = new ArrayList<>();
		
		list.add(st);
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		
		Map<Integer, List<Student>> collect = list.stream().collect(Collectors.groupingBy(x->x.getAge()));
		//System.out.println(collect);
		Map<Object, Set<Student>> collect1 = list.stream().collect(Collectors.groupingBy(x->x.getAge(),Collectors.toSet()));
		//System.out.println(collect1);
		
		Map<Integer, List<String>> collect2 = list.stream().collect(Collectors.groupingBy(x->x.getAge(),Collectors.mapping(x->x.getName(),Collectors.toList())));
		System.out.println(collect2);
		Hashtable<Integer, List<String>> collect3=list.stream().collect(Collectors.groupingBy(x->x.getAge(), ()->new Hashtable(), Collectors.mapping(x->x.getName(), Collectors.toList())));
		//System.out.println(collect3);
		
	}
}
