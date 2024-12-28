package oops_;

public class TetsThrows2 
{
	public static void main(String args[])
	{
	try 
	{
		M m=new M();
		
		m.method();
	}
	
	catch(Exception e)
	{
		System.out.println("Exception Handeled");
	}
	
	System.out.println("Normal flow...");
	
	}
}
