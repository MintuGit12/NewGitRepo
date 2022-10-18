package coreJava;
class Parent12
{
	public final void m1()
	{
		System.out.println("parent private");
	}
	public String sum()
	{
		System.out.println(67+2000 );
		return "durga";
	}
	public Object sum(int x)
	{
		System.out.println(x+20 );
		return "durga";
	}
	private void m2()
	{
		System.out.println("parent private");
	}
}
class Child12 extends Parent12
{
	/*public void m1()
	{
		System.out.println("child private");
	}*/
	public String sum(int x)
	{
		System.out.println(x+2000 );
		return "durga";
	}
	public Object sum(String g)
	{
		System.out.println(67+2000 );
		return "durga";
	}
}
public class OverRideTest {

	public static void main(String[] args) {
		Parent12 p=new Child12();
		p.sum(20);
		//p.m1();
		Parent12 p2=new Parent12();
		p2.sum(300);
		//p2.m2();
		Child12 c=new Child12();
		c.sum(45);c.m1();
	}

}
