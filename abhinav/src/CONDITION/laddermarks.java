package CONDITION;

import java.util.Scanner;

public class laddermarks 
{
	public static void main (String args[])
	{
		int m;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Marks");
		m=sc.nextInt();
		
		if(m>=0 && m<35)
		{
			System.out.println("Fail");
		}
		
		else if (m>=35 && m<50)
		{
			System.out.println("C");
		}
		else if (m>=50 && m<70)
		{
			System.out.println("B");
		}
		else if (m>=70 && m<100)
		{
			System.out.println("A");
		}
		
		else
		{
			System.out.println("invalid Marks");
		}

	
		


}
}
