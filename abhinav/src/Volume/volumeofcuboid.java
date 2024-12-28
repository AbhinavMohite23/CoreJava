package Volume;

import java.util.Scanner;

public class volumeofcuboid 
{
	public static void main (String args[])
	{
		int v,l,b,h;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter length");
		l=sc.nextInt();
		System.out.println("enter breadth");
		b=sc.nextInt();
		System.out.println("enter height");
		h=sc.nextInt();
		v=l*b*h;
		System.out.println("volume=" + v);
		
		
	}

}
