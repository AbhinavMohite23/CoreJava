package CONDITION;

import java.util.Scanner;

public class alphabet 
{
	public static void main (String args[])
	{
		String u,p;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter username and password");
		u=sc.next();
		p=sc.next();
		
		if(u.equals("Abhinav") && p.equals("Mohite"))
		{
			System.out.println("login successfull");
		}
		
		else
		{
			System.out.println("login Failed");
		
		}
	}

	

}
