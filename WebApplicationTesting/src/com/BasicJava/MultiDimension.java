package com.BasicJava;

public class MultiDimension {

	public static void main(String[] args)
	{
		//dataType arrayName[][] = new dataType[size][size];
		// dataType [][]arrayName = new dataType[size][size];
		
		String a[][] = new String[2][2];
		
		a[0][0] = "Sudha";
		a[0][1] = "Hello";
		
		a[1][0] = "Ram";
		a[1][1] = "Hii";
		
		//a[2][0] = "Krishna";
		
		for(int i=0;i<a.length;i++) // Rows
		{
			for(int j=0;j<a.length;j++) // in every Row - should goto all the columns
			{
				System.out.println(a[i][j]);
			}
		}
		

	}

}
