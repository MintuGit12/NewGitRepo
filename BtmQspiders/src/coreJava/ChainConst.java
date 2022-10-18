package coreJava;
class Const
{
	int age;
	static String name;
	int roll1=28368;
	Const(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
	Const()
	{
		
	}
	public static void m1(ChainConst c)
	{
		//Const c1=new Const(24,"rahulllll");
		
		System.out.println("age is :"+c.age);
		c.name="razia";
	}
	public void m3()
	{
		System.out.println(roll1);
	}
}
public class ChainConst extends Const {
int roll;
int roll1=99999;
	ChainConst(int age,String name,int roll)
	{
		super(age,name);
		this.roll=roll;
	}
	ChainConst(int age,int roll,String name)
	{
		this(age,name,roll);
	}
	ChainConst()
	{
		
	}
	public void m2()
	{
		System.out.println(roll1);
	}
	public static void main(String[] args) {
		ChainConst c=new ChainConst(23,"ram",234);
		c.m1(c);
		System.out.println(c.name);
		Const c1=new ChainConst();
		c1.m3();
	}

}
