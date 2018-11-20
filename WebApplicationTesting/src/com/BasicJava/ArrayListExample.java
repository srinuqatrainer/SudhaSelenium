package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		//List<dataType>arrayName = new ArrayList<>();
		
		List<String>a = new ArrayList<>();
		
		a.add("Sudha");
		a.add("Hello");
		a.add("Hii");
		a.add("Ram");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(i+" "+ a.get(i));
		}
		
		
		

	}

}
