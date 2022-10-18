package coreJava;
interface A
{
	final static int a=100;
	int b=40;
	void show();
	static void disp()
	{
	System.out.println();	
	}
	
}
class B implements A
{
	void show2()
	{
		System.out.println("static method of b");
	}
public void show()
{
	System.out.println("value of b is"+b);
}
 void disp1(B b)
{
b.flow1();	
//b.disp();static method cannot be run outside the interface 
}
 //abstract void flow();
 public void flow1()
 {
	 System.out.println("this is class b");
 }
}
public class StaticInterDriver extends B 
{
	 void show2()
	{
		System.out.println("StaticInterDriver ststic method");
	}
	public void show()
	{
		System.out.println("value of b is"+b+45);
	}
	public static void main(String[] args) 
	{
		B s=new StaticInterDriver();
		s.show2();
		//B b=new B();
		//b.disp1(b);
		//b.show();

	}

}
