package oops1;

public class A 
{
	void m()
	{
		System.out.println("Hello m");
	}
	void n()
	{
		System.out.println("Hello n ");
		this.m();
	}

}
