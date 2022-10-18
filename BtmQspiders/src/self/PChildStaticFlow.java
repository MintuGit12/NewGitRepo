package self;
class Parent33
{
	static int x=200;
	static
	{
		m1();
		System.out.println("Base class static block");
	}
	public static void main(String[] args)
	{
		m1();
		System.out.println("base class main");
	}
	public static void m1()
	{
		System.out.println(j);
	}
	static int j=2999;
}
public class PChildStaticFlow extends Parent33 {
static int x=100;
static
{
	m2();
	System.out.println("chld class 1st static ");
}
	public static void main(String[] args) {
		m2();
		System.out.println("child class main");
	}
	public static void m2()
	{
		System.out.println(y);
	}
	static
	{
		System.out.println("2nd static block");
		System.out.println(x);
	}
	static int y=1999;

}
