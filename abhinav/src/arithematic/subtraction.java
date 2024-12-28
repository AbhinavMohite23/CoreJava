package arithematic;

import java.util.Scanner;

public class subtraction 
{
	public static void main (String args[])
	{
		int a,b,sub ;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		sub=a-b;
		System.out.println("subtraction=" + sub);
	}

}
