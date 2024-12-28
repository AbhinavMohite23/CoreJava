package oops_;

import java.util.Scanner;

public class Addition 
{
	Addition()
	{
		int num1,num2,sum;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=num1+num2;
		
		System.out.println("Addition is:"+sum);
	}
		
		
		
	
	Addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition is:"+sum);
		
	}
	
	Addition(double a,double b)
	{
		double sum=a+b;
		System.out.println("Addition is:"+sum);
	}
	
	
	
	Addition(int a,int b,int c)
	{
		int sum =a+b+c;
		System.out.println("Addition is:"+sum);
	}
	
	public static void main(String args[])
	{
		Addition a = new Addition();
		Addition b = new Addition(77,33);
		Addition c = new Addition(3.14,2.7);
		Addition d = new Addition(24,36,25);
	}

}


