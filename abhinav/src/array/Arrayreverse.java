package array;

import java.util.Scanner;

public class Arrayreverse 
{
	public static void main (String args[])
	{
		int i,size;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size");
		size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display elements in reverse order");
		
		for(i=size-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
			
				
	}

	

}
