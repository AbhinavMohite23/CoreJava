package Area;

import java.util.Scanner;

public class Areaofrectangle 
{
	public static void main (String args[])
	{
		int l,b,a;
			Scanner sc = new Scanner (System.in);
			System.out.println("enter length");
			l=sc.nextInt();
			System.out.println("enter breadth");
			b=sc.nextInt();
			a=l*b;
			System.out.println("area ="+ a);
			
	}
	

}
