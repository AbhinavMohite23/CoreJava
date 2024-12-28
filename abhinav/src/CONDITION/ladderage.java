package CONDITION;

import java.util.Scanner;

public class ladderage 
{
	
		public static void main (String args[])
		{
			int age;
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter your age");
			age=sc.nextInt();
			
			if(age>=0&&age<5)
			{
				System.out.println("Toddlers");
			}
			else if (age>=5&&age<13)
			{
				System.out.println("Kids");
			}
			else if (age>=13&&age<20)
			{
				System.out.println("Teenagers");
				
			}
			else if (age>=20&&age<40)
			{
				System.out.println("Youths");
			}
			else
			{
				System.out.println("Senior Citizens");
			}
				
			
			
		}
		
	}

	


