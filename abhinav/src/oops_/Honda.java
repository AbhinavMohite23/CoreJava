package oops_;

public class Honda extends Bikee
{
	void run()
	{
		System.out.println("running safely with 100kmph");
	}
	
	public static void main(String args[])
	{
		Honda honda=new Honda();
		honda.run();
	}

}
