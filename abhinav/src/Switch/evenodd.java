package Switch;

import java.util.Scanner;

public class evenodd 
{
	public static void main(String args [])
	{
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		
		switch(num%2)
		{ 
		case 0:
			System.out.println("Even number");
		break;
		
		case 1:;
		       System.out.println("Odd number");
		break;
		
		default:System.out.println("error");
		break;
		}
		       
	}

	
}
