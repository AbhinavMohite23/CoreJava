package Switch;

import java.util.Scanner;

public class customercare 
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc = new Scanner (System.in);
		System.out.println("\n 1.Hindi \n 2.Marathi \n 3.English \n Enter your choice");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("Namaste");
		break;
		  
		case 2:System.out.println("Namaskar");  
		break;
		
		case 3:System.out.println("Welcome");
		break;
		
		default :System.out.println("Choice is not found");
		break;
		     
		}
	}
	
	

	
}
