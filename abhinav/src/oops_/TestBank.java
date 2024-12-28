package oops_;

public class TestBank 
{
	public static void main (String args[])
	{
		Bank1 b;
		b=new SBI1();
		System.out.println("Rate of Interest :"+b.getRateofInterest()+"%");
		
		b=new PNB();
		System.out.println("Rate of Interest :"+b.getRateofInterest()+"%");
		
	}

}
