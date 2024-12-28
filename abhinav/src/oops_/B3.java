package oops_;

public class B3 extends A2
{
	B3()
	{
		super();
		System.out.println("Child class constructor is invoked");
	}
	
	B3(int a)
	{
		super();
		System.out.println("Child class constructor is invoked"+a);
	}
	{
		System.out.println("instance initializer block is invoked");
		
	}
	public static void main(String args[])
	{
		B3 b1=new B3();
		B3 b2=new B3(10);
	}

}
