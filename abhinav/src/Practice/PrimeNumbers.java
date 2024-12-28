package Practice;

import java.util.Scanner;

public class PrimeNumbers 
{
	public static void main(String args[])
	{
		int n;
		int count=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)

			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("Number is prime number");
		}
		
		else
		{
			System.out.println("Number is Not a prime number");
		}
	}

	

}
