package oops1;

public class Student2 
{
	int rollno;
	String name;
	static String college="JSPM";
	
	static void change()
	{
		college="TSSM";
	}
	Student2(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+""+name+""+college);
	}
	

}
