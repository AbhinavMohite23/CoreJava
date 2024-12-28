package oops1;

public class Student3 
{
	int rollno;
	String name;
	float fee;
	
	Student3(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+""+name+""+fee);
	}

}
