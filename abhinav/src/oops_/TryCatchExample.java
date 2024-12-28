package oops_;

public class TryCatchExample 
{
	public static void main(String args[])
	{
		try
		{
			int data=50/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Rest of the code");
	}

}
