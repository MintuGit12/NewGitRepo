package coreJava;
interface I1
{
	void m1();
	void show();
	static void s1()
	{
	System.out.println("ststic method");
	}
	default void disp()
	{
		System.out.println("default method in interface");
	}
}
interface I2 extends I1
{
	interface I3
	{
		void m4();
	}

	default void disp()
	{
		System.out.println("default method in interface overridden");
	}
}
class My implements I2
{
	
	public void m1()
	{
		System.out.println("m1 method of I1");
	}
	public void show()
	{
		System.out.println("show method");
	}
}

public class MyInterface {

	public static void main(String[] args) {
	I1 i=new My();
	i.m1();
	i.show();
	i.disp();
	I1.s1();
	}

}
