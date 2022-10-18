package coreJava;
class Parent33
{
	public void m1()
	{
		System.out.println("parent method");
	}
	public void m2()
	{
		System.out.println("parent method2222222");
	}
}
abstract class Child33 extends Parent33
{
	 public abstract void m1();
}
class GrandChild extends Child33
{
	public void m1()
	{
		System.out.println("GrandChild method");
	}
}
public class OverrideAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent33 p=new Parent33();
p.m1();
//Parent33 p1=new Child33();
//p1.m1();
GrandChild g=new GrandChild();
g.m1();
Parent33 p1=new GrandChild();
p1.m1();
p1.m2();
	}

}
