package Area;

import java.util.Scanner;

public class areaoftrapezium 
{
	public static void main (String args[])
	{
		double a,l,b,h;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter length");
		l=sc.nextDouble();
		System.out.println("enter breadth");
		b=sc.nextDouble();
		System.out.println("enter height");
		h=sc.nextDouble();
		a=0.5 *(l+b)*h;
		System.out.println("area=" +a);
	}

}
