package CONDITION;

import java.util.Scanner;

public class nestednumbers 
{
	public static void main (String args[])
	{
		String num;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		num=sc.next();
		
		if(num.equals("20"))
			
		{
			System.out.println("Valid number");
			
			if(num.equals("50"))
				
			{
				System.out.println("Valid number");
				
				if(num.equals("100"))
				{
					System.out.println("Valid number");
				}
			}
			
		}
		
		else
		{
			System.out.println("Invalid number");
			
			
		}
		
	}
		

	

}
