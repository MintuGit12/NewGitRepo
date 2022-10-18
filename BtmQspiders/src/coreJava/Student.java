package coreJava;

class Human
{
	int age;
	String name;
	Human()
	{
		System.out.println("Human default constructor");
	}
	Human(int age,String name)
	{
		this();
		System.out.println("this will be initialized 1st ");
	this.name=name;
	this.age=age;
	}
	public void  hum()
	{
		System.out.println("name  is:"+name);
		System.out.println("age is:"+age);
	}
}
class Employee extends Human
{
	String empid;
	String designation;
	int age1;
	Employee(int age1)
	{ 
		super();
		this.age1=age1;
		System.out.println("default constructor of employee");
	
	}
	Employee(){}
	Employee(String empid,String designation,int age,String name)
	{		
	   super(age,name);
		System.out.println("this will be initialized 2nd ");
		this.empid=empid;
		this.designation=designation;

	}
	public void  emp()
	{
		System.out.println("Emp id is:"+empid);
		System.out.println("Designation id is:"+designation);
		System.out.println("name  is:"+name);
		System.out.println("age is:"+age);
		System.out.println("age is:"+age1);
	}
}
public class Student extends Employee
{
	int id;
	String stream;
	{age=450000;}
Student(int id,int age,String designation,String stream,String empid,String name)
{
	super(empid,designation,age,name);
	System.out.println("this will be initialized 3rd ");
	this.id=id;
	this.stream=stream;

}
public void  stu()
{

	System.out.println("Stream  is:"+stream);
	System.out.println(" id is:"+id);
}
	public static void main(String[] args) {
	
Student s=new Student(101,34,"supervisor","electrical","E123RT","Amit");
s.emp();
s.hum();
s.stu();
	}

}