package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*list1 = {1,2,3,4,5} ,
list2 = {3,4,5,6,7}

1.Find out the common elements from the two lists (O/P - 3,4,5)
2.Find the union of these two list (O/P - 1,2,3,4,5,6,7)*/
public class M14
{
	public static void main(String[] args)
	{
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(3,4,5,6,7);
		
		Set<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toSet());
		System.out.println("Common Element"+collect);
		Set<Integer> collect2 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet());
		System.out.println("Union of two list"+collect2);
	}
}
