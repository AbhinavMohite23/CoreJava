package Switch;

import java.util.Scanner;

public class numbers 
{
	public static void main (String args[])
	{
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println("\n 1.10 \n 2.50 \n 3.100 \n Enter your Choice");
		num=sc.nextInt();
		
		switch(num)
		{
		case 1:System.out.println("10");
		break;
		
		case 2:System.out.println("50");
		break;
		
		case 3:System.out.println("100");
		break;
		
		default:System.out.println("Choice not found");
		break;
		}
	}
	

	
}
