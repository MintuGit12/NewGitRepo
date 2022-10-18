package self;
//in var arg case it become overloading not overriding
class P1
{
	public void m1(int...x)
	{
		System.out.println("var arg parent");
	}
}
class C1 extends P1
{
	public void m1(int x)
	{
		System.out.println("normal child");
	}
	public void m1(int... x)
	{
		System.out.println("var arg child");
	}
}
public class Var_Arg {

	public static void main(String[] args) 
	{
	P1 p=new P1();
	p.m1(10,20,30);
	C1 c=new C1();
	c.m1(0);
	P1 p1=new C1();
	p1.m1(0);
	p1.m1(10,20,30);
	}

}
