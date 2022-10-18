package self;
class Parent455
{
	int i=10;
	{
		m1();
		System.out.println("1st instance block parent");
	}
	Parent455()
	{
		System.out.println("parent constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("parent main method");
		Parent455 p1=new Parent455();
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("2nd instance block parent");
	}
	int j=20;
}
public class ParentChildInstance extends Parent455
{
	int x=1000;
	{
		m2();
		System.out.println("chid class 1st instance");
	}
	ParentChildInstance()
	{
		System.out.println("child constructor");
	}

	public static void main(String[] args) 
	{
		ParentChildInstance p=new ParentChildInstance();
		System.out.println("child main");
	}
	public void m2()
	{
		System.out.println(y);
	}
	{
		System.out.println("2nd instance block of child");
	}
	int y=2000;
}/*output
0
1st instance block parent
2nd instance block parent
parent constructor
0
chid class 1st instance
2nd instance block of child
child constructor
child main
*/

