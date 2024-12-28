package CONDITION;

import java.util.Scanner;

public class nestedlogin 
{
	public static void main (String args[])
	{
		String u,p;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter username");
		u=sc.next();
		if(u.equals("Abhinav"))
		{
			System.out.println("enter password");
			p=sc.next();
			
			if(p.equals("Mohite"))
			{
				System.out.println("Login successful");
				
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
		else
		{
			System.out.println("Incorrect Username");
		}
	}

	
}
