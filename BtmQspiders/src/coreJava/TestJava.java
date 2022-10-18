package coreJava;
class A989
{
	int x=9999;
	A989()
	{
		super();
	}
	/*public static void m1(String i)
	{
		System.out.println("parent");
		
	}*/
	public static void m1(Object o)
	{
		System.out.println("parent11");
	}
}
class B989 extends A989
{
	int x=10;
	
	public static void m1(Object o)
	{
		System.out.println("child..........");
	}
	public static void m1(String o)
	{
		System.out.println("jgdsgfkasdhkh");
	}
}
public class TestJava {

	public static void main(String[] args) {
		B989 b=new B989();
		b.m1("hiii");
		System.out.println(b.x);
		//b.m2();
		A989 a=new A989();
		a.m1(new A989());
		a.m1(null);
		System.out.println(a.x);
		//a.m2();
		A989 a1=new B989();
		a1.m1("hiii");
		System.out.println(a1.x);
		//a1.m2();//cannot run
	}

}
