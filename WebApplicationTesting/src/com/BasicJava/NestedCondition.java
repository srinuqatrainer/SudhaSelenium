package com.BasicJava;

public class NestedCondition {

	public static void main(String[] args)
	{
		int a=50;
		int b=40;
		int c=30;
		
		
		if(a>b & a>c)
		{
			System.out.println(" a is greater ");
		}
		else
			if(b>c)
		{
			System.out.println(" b is greater ");
		}
			else
			{
				System.out.println(" c is greater ");
			}

	}

}
