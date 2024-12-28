package Area;

import java.util.Scanner;

public class areaofrhombus 
{ 
	public static void main (String args [])
	{
		int a,s;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter value of side");
		s=sc.nextInt();
		a=s*s;
		System.out.println("area=" + a);
	}

}
