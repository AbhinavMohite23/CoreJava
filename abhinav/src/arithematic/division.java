package arithematic;

import java.util.Scanner;

public class division 
{
	public static void main (String args[])
	{
		int a,b,div;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		div=a%b;
		System.out.println("division=" + div);
	
		
	}

}
