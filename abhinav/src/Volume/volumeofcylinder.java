package Volume;

import java.util.Scanner;

public class volumeofcylinder 
{
	public static void main (String args[])
	{
		double v,r,h;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter radius");
		r=sc.nextDouble();
		System.out.println("enter height");
		h=sc.nextDouble();
		v=3.14*r*r*h;
		System.out.println("volume="+v);
		
	}

}
