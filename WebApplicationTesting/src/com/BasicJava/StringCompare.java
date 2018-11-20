package com.BasicJava;

public class StringCompare
{

	public static void main(String[] args) 
	{
		String a="sudha";
		System.out.println(a);
		System.out.println("******************");
		
		String b="Hello";
		String c="Hello";
		
		if(b.equals(c))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both string are not equal ");
		}
		System.out.println("******************");
		
		String d="Hello";
		String e="Chello";
		
		if(d.equals(e))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both string are not equal ");
		}
		System.out.println("******************");
		
		
		String f="Hello";
		String g="hello";
		
		if(f.equals(g))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both string are not equal ");
		}
		System.out.println("******************");

		
		String h="Hello";
		String i="hello";
		
		if(h.equalsIgnoreCase(i))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both string are not equal ");
		}
		System.out.println("******************");
		
		String j="Hello";
		String k=" hello";
		
		if(j.equalsIgnoreCase(k))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both string are not equal ");
		}
		System.out.println("******************");
		
		
		
		String l="Hello";
		String m=" ello";
		
		if(l.contains(m))
		{
			System.out.println(" m exists in l ");
		}
		else
		{
			System.out.println(" m not exits in l");
		}
		System.out.println("******************");
		
		
	}

}
