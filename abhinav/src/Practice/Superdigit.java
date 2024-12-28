package Practice;

import java.util.Scanner;

public class Superdigit 
{
	public static void main (String args[])
	{
		int pow;
		int num;
		int i=1;
		int sum=1;
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		
		System.out.println("Enter any power");
		pow=sc.nextInt();
		
		while(i<=pow)
		{
			sum=sum*num;
			i++;
		}
		
		
		System.out.println("\nSuper digit is:"+sum);
	}

	
}
