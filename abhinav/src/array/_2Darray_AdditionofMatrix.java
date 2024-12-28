package array;

import java.util.Scanner;

public class _2Darray_AdditionofMatrix 
{
	public static void main(String args[])
	{
		int r,c,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row and Column size");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int sum[][]=new int[r][c];
		
		System.out.println("Enter 1st matrix"+r+"*"+c);
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("1st Matrix is");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println("\t"+a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Enter 2nd matrix "+r+"*"+c);
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("2nd matrix is");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.println("\t"+b[i][j]);
				
			}
			System.out.println();
		}
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Display Sum of matrix=");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println("\t"+sum[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
