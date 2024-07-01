package com.sukla.string1;
//Anagram
public class M1
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = "bac";
		boolean b=anagram(s1,s2);
		System.out.println(b);
	}

	private static boolean anagram(String s1, String s2)
	{
		boolean b = true;
		if(s1.length()!=s2.length())
		{	b= false;
			return b;
		}
		int count[] = new int[26];
		
		for(char ch: s1.toCharArray())
		{
			count[ch-97]++;
		}
		for(char ch: s2.toCharArray())
		{
			count[ch-97]--;
		}
		
		for(int val: count)
			if (val!=0)
				b=false;
			return b;
			
		
	}
}
