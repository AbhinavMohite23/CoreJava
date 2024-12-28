package Area;

import java.util.Scanner;

public class areaofellipse 
{
	public static void main (String args[])
	{
		double a,l,b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of semi major axis ");
		l=sc.nextDouble();
		System.out.println("Enter the length of semi minor axis ");
		b=sc.nextDouble();
		a=3.14*l*b;
		System.out.println("area=" + a);
		
	}

}
