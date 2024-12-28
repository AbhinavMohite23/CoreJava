package CONDITION;

import java.util.Scanner;

public class triangle 
{
	public static void main (String args[])
	{
		int a,b,c;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter first angle");
		a=sc.nextInt();
		
		System.out.println("enter second angle");
		b=sc.nextInt();
		
		System.out.println("enter third angle");
		c=sc.nextInt();
		
		
		if(a+b+c==180)
		{
			System.out.println("given shape is a triangle");
		
		}
		
		else
		{
			System.out.println("given shape is not a triangle");
		}
	}

}
