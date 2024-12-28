package Volume;

import java.util.Scanner;

public class volumeofcone 
{
	public static void main (String args[])
	{
		double r,h,v;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter radius");
		r=sc.nextDouble();
		System.out.println("enter height");
		h=sc.nextDouble();
		v=(1%3)*r*r*h;
		System.out.println("volume=" + v);
	}

}
