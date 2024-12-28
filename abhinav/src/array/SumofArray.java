package array;

import java.util.Scanner;

public class SumofArray 
{
	public static void main (String args[])
	{
		int i,size,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		sum=0;
		for(i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of array elements ="+sum);
		
		
	}

}
