package CONDITION;

import java.util.Scanner;

public class alphabets 
{
	public static void main (String args[])
	{
		String ch;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Alphabet");
		ch=sc.next();
		
		if(ch.equalsIgnoreCase("a")||ch.equalsIgnoreCase("E")||ch.equalsIgnoreCase("i")||ch.equalsIgnoreCase("o")||ch.equalsIgnoreCase("u"))		
	
			{
			System.out.println("Alphabet is Vowel");
			}
		
		else
		{
			System.out.println("Alphabet is Consonent");
		}
	}

      

}
