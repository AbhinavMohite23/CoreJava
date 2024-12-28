package CONDITION;

import java.util.Scanner;

public class Numberpositive 
{
	public static void main (String args [])
	{
		int num;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Number is positive");
		
		}
		
		else
		{
			System.out.println("Number is negative");
		}
	}

}
