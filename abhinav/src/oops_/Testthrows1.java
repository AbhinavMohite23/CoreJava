package oops_;

import java.io.IOException;

public class Testthrows1 
{
	void m() throws IOException
	{
		throw new IOException("device error");
	}
	void n() throws IOException
	{
		m();
		
	}
	void p()
	{
		try {
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
	
	public static void main(String args[])
	{
		Testthrows1 obj =new Testthrows1();
		
		obj.p();
		System.out.println("normal flow...");
	}

}
