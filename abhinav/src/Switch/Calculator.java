package Switch;

import java.util.Scanner;

public class Calculator 
{
	public static void main (String args [])
	{
		int a,b,add,sub,mul,div,cal;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number");
		a=sc.nextInt();
		System.out.println("Enter Second number");
		b=sc.nextInt();
		
		System.out.println("\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n Enter your Choice");
		cal=sc.nextInt();
		
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a%b;
		
		
		switch(cal)
		{
		case 1:System.out.println("Addition=" +add);
		break;
		
		case 2:System.out.println("Subtraction="+sub);
		break;
		
		case 3:System.out.println("Multiplication="+mul);
		break;
		
		case 4:System.out.println("Division="+div);
		break;
		
		default:System.out.println("choice not found");
		break;
		
		
		}
	}

	
}
