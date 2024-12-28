package Area;

import java.util.Scanner;

public class areaoftriangle 
{
	public static void main (String args[])
	{
		double a,b,h;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter breadth");
		b=sc.nextDouble();
		System.out.println("enter height");
		h=sc.nextDouble();
				a=0.5*b*h;
				System.out.println("area=" + a);
				
	}

}
