package Surfacearea;

import java.util.Scanner;

public class surfaceareaofsphere 
{
	public static void main (String args [])
	{
		double s,r;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter radius");
		r=sc.nextDouble();
		s=4*3.14*r*r;
		System.out.println("surface area=" + s);
	}

}
