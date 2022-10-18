package self;
class P
{
	/*public static void m1()
	{
		System.out.println("parent");
	}*/
	public void m1()
	{
		System.out.println("parent");
	}
}
class C extends P
{
	public static void m1()
	{
		System.out.println("parent");
	}
	/*public void m1()
	{
		System.out.println("parent");
	}*/
}
public class MethodHiding {

	public static void main(String[] args) {
		P p=new C();
		p.m1();
		C c=new C();
		c.m1();
	}

}
