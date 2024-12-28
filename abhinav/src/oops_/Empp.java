package oops_;

public class Empp extends Person
{
	float salary;
	Empp(int id,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
		
	}
	void display()
	{
		System.out.println(id+""+name+""+salary);
	}

}
