package oops_;

public class TestjoinMethod3 extends Thread
{
	public void run()
	{
		System.out.println("running...");
	}
	public static void main (String args[])
	{
		TestjoinMethod3 t1=new TestjoinMethod3();
		TestjoinMethod3 t2=new TestjoinMethod3();
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("Name of t2:"+t2.getName());
		System.out.println("id of t1:"+t1.getId());
		
		t1.start();
		t2.start();
		
		t1.setName("Sonoo");
		
		System.out.println("After changing name of t1:"+t1.getName());
	}

}
