package com.BasicJava;

public class ObjectArray {

	public static void main(String[] args)
	{
		//Object arrayName[] = new Object[size];
		
		Object a[] = new Object[3];
		
		a[0] = 10;
		a[1] = "Sudha";
		a[2] = 10.123;
		//a[3] = "Hello";
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
