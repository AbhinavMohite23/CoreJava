package oops_;

public class B2 extends A
{
	B2()
	{
		super();
		{
			System.out.println("child class is invoked");
		}
	}
	{
		System.out.println("instance initializer block is invoked");
	} 
	
	public static void main(String args[])
	{
		B2 b=new B2();
	}

}
