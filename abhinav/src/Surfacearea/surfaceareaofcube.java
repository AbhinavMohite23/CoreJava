package Surfacearea;

import java.util.Scanner;

public class surfaceareaofcube 
{
	public static void main (String args[])
	{
		int s,a;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter side");
		a=sc.nextInt();
		s=6*a*a;
		System.out.println("surface area=" + s);
	}

}
