package com.sukla.linkedlist;
class Node
{
	int i;
	Node ref;
	Node(int i)
	{
		this.i = i;
	}
}
class LinkedList
{
	Node first;
	Node last;
	void add(int i)
	{
		Node element = new Node(i);
		if(first==null)
		{
			first=element;
		}
		else
		{
			last.ref=element;
		}
		last=element;
	}
	void iterate()
	{
		Node current= first;
		while(current!=null)
		{
			System.out.println(current.i);
			current=current.ref;
		}
		
	}

}
class M1
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.iterate();
		
	}
}
