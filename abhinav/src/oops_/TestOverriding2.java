package oops_;

public class TestOverriding2 
{
	public static void main(String args[])
	{
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		
		System.out.println("SBI Rate Of Interst:"+s.getRateOfInterest());
		System.out.println("ICICI Rate Of Interst:"+i.getRateOfInterest());
		System.out.println("AXIS Rate Of Interst:"+a.getRateOfInterest());
	}

}
