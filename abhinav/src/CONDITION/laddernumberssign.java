package CONDITION;

import java.util.Scanner;

public class laddernumberssign 
{
	public static void main(String args[])
	{
		int num;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any Number");
		num=sc.nextInt();
		
		if(num<0)
		{
			System.out.println("Negative Number");
		}
		else if(num==0)
		{
			System.out.println("NUMBER IS NEITHER pOSITIVE NOR NEGATIVE");
		}
		else if(num>0)
		{
			System.out.println("Positive Number");
		}
		
		else
		{
			System.out.println("zero");
		}
	}
	


}
