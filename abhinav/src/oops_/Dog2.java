package oops_;

public class Dog2 extends Animal2
{
	void eat()
	{
		System.out.println("Eating bread...");
	}
	void bark()
	{
		System.out.println("barking...");
	}
	void work()
	{
		super.eat();
		bark();
	}

}
