package arithematic;

import java.util.Scanner;

public class multiplication 
{
	public static void main (String args[])
	{
		int a,b,mul;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		mul=a*b;
		System.out.println("multiplication=" + mul);
	}

}
