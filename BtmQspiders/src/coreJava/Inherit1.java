package coreJava;
class Parent
{
	static int age;
	static String name;
	{
		System.out.println("static method parent 1");
	}
	{
		System.out.println("this is parent initializer 2");
	}
	public static void p1()
	{
		System.out.println(age);
		System.out.println(name);
	}
	Parent()
	{
		this.age=23;
		this.name="raman";
	}
}
public class Inherit1 extends Parent
{
	static
	{
		System.out.println("child static 1");
	}
	{
		System.out.println("child will load after parent 2");
	}
	Inherit1(int age,String name)
	{
		//super(age,name);
		this.age=age;
		this.name=name;
	}
	public void In1()
	{
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String[] args)
	{
Inherit1 i=new Inherit1(56,"rahul");
i.In1();
p1();
//Parent p=new Parent();
//p.p1();
	}
}
