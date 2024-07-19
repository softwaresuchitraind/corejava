package com.sukla.streamjavat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class M11
{
	public static void main(String[] args)
	{
		Book b1 = new Book("1","java",1000.50);
		Book b2 = new Book("2","c",2000.50);
		Book b3 = new Book("3","datastructure",500.50);
		Book b4 = new Book("4","oracle",400.50);
		
		List<Book> booklist=Arrays.asList(b1,b2,b3,b4);
		System.out.println(booklist);
		Collections.sort(booklist, (a,b)->b.getBookName().compareTo(a.getBookName()));
		System.out.println(booklist);
	}
}
