package Volume;

import java.util.Scanner;

public class volumeofpyramid 
{
	public static void main (String args [])
	{
		double v,l,w,h;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter length");
		l=sc.nextDouble();
		System.out.println("enter width");
		w=sc.nextDouble();
		System.out.println("enter height");
		h=sc.nextDouble();
		v=0.999*l*w*h;
		System.out.println("volume=" + v);
	}

}
