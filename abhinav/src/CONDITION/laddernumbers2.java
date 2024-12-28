package CONDITION;

import java.util.Scanner;

public class laddernumbers2
{
	public static void main (String args[])
	{
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any Number");
		num=sc.nextInt();
		
		if(num==10)
		{
			System.out.println("Number is 10");
		}
		else if(num==50)
		{
			System.out.println("Number is 50");
		}
		else if (num==100)
		{
			System.out.println("Number is 100");
		}
		
		else
		{
			System.out.println("Invalid number");
		}
	}

	

}
