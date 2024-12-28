package CONDITION;

import java.util.Scanner;

public class Voting 
{
	public static void main (String args [])
	{
		int age;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		
		if(age>=0)
		{
			System.out.println("Eligible");
		}
		
		else
		{
			System.out.println("Not Eligible");
		}
	}
	

}
