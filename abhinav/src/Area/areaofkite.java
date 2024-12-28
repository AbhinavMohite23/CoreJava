package Area;

import java.util.Scanner;

public class areaofkite 
{
	public static void main (String args[])
	{
		int d1,d2,a;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter first diagonal");
		d1=sc.nextInt();
		System.out.println("enter second diagonal");
		d2=sc.nextInt();
		a=d1*d2;
		System.out.println("area=" + a);
		
	}
	

}
