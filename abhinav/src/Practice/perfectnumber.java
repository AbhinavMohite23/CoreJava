package Practice;

import java.util.Scanner;

public class perfectnumber 
{
	public static void main (String args [])
	{
		int n;
		int i=1;
		int sum=0;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any Number");
		n=sc.nextInt();
		
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		
		if (sum==n)
		{
			System.out.println(n+"is a perfect number");
		}
		
		else 
		{
			System.out.println(n+"is not a perfect number");
		}
		
	}

	

}
