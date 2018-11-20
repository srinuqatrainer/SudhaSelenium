package com.BasicJava;

public class TryCatchExample {

	public static void main(String[] args) 
	{
		int a=20;
		int b=10;
		
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Cannot perfrom a/b");
		}

	}

}
