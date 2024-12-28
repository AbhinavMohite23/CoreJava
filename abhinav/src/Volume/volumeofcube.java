package Volume;

import java.util.Scanner;

public class volumeofcube 
{
	public static void main (String args [])
	{
		int v,s;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter value of one side ");
		s=sc.nextInt();
		v=s*s*s;
		System.out.println("volume=" + v);
	}


}
