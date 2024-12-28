package oops_;

interface Drawable1 
{
	void draw();
	default void msg()
	{
		System.out.println("default method");
	}

}
