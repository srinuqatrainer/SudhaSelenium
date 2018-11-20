package com.BasicJava;

public class SingleDimension {

	public static void main(String[] args)
	{
		/*int a=10;
		a=20;
		System.out.println(a);*/
		
		//dataType arrayName[] = new dataType[size];
		//dataType []arrayName = new dataType[size];
		
		
		int a[] = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		
	/*	System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(a[2]); */
		
		//for(int i=0;i<3;i++) // i=0,i=1,i=2
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
