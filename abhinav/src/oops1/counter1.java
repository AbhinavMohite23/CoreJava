package oops1;

public class counter1 
{
	int count=0;
	counter1()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[])
	{
		counter1 c1=new counter1();
		counter1 c2=new counter1();
		counter1 c3=new counter1();
	}

}
