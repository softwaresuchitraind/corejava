package com.sukla;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap 
{
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "John");
		map.put(102, "Smith");
		map.put(103, "Orlen");
		map.put(102, "David");
		System.out.println(map.get(101));
		System.out.println("Map Size :: " +map.size());
		Collection<String> values = map.values();
		for(String v : values)
		{
			System.out.println(v);
		}
		
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet)
		{
			System.out.print(key);
			System.out.println(map.get(key));
		}
		System.out.println("************");
		 Set<Entry<Integer, String>> entrySet = map.entrySet();
		 Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		 while(iterator.hasNext())
		 {
			 Entry<Integer, String> entry = iterator.next();
			 System.out.println(entry.getKey()+ "--"+entry.getValue());
		 }
		
		System.out.println(map.containsKey(101));
		System.out.println(map.containsKey(104));
		System.out.println(map.isEmpty());
		System.out.println(map);
		
	}

}
