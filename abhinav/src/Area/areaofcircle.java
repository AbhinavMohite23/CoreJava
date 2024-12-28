package Area;

import java.util.Scanner;

public class areaofcircle 
{
	public static void main (String args[])
	{
		double a,r;
		Scanner sc = new Scanner (System.in);
				System.out.println("enter radius");
		r=sc.nextDouble();
		a=3.14*r*r;
		System.out.println("area=" + a);
	}

}
