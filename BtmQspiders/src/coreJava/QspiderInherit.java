package coreJava;
class Staff
{
	String name;
	int id;
	String desig;
	static
	{
		System.out.println("Staff static method");
	}
	{
		System.out.println("staff non static method obj creation");
	}
	
	public void m0()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(desig);
	}
	
}
class Trainer extends Staff
{
	static
	{
		System.out.println("Trainer static method");
	}
	{
		System.out.println("Trainer non static method obj creation");
	}
	public void m1()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(desig);
	}
	Trainer(String name,int id,String desig)
	{
		this.name=name;
		this.id=id;
		this.desig=desig;
	}
}
class Councellor extends Staff
{
	static
	{
		System.out.println("councellor static method");
	}
	{
		System.out.println("coucellor non static method obj creation");
	}
	public void m2()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(desig);
	}
	
	
}
class Hr extends Staff
{
	static
	{
		System.out.println("Hr static method");
	}
	{
		System.out.println("Hr non static method obj creation");
	}
	public void m3()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(desig);
	}
	public void m0()
	{
		System.out.println("jjgjjgj "+name);
		System.out.println(id);
		System.out.println(desig);
	}
	Hr(String name,int id,String desig)
	{
		this.name=name;
		this.id=id;
		this.desig=desig;
	}
}
public class QspiderInherit 
{

	public static void main(String[] args)
	{
Staff s1=new Hr("golu",101,"swepper");
s1.m0();
//s1.m3();
Staff s=new Staff();
s.m0();
Councellor c=new Councellor();
c.m0();
}
}