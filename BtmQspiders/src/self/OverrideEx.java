package self;
class Parent89
{
	static
	{
		System.out.println("1st to upload");
	}
	{
		System.out.println("obj of parent");
	}
	Parent89()
	{
		System.out.println("constructor of paent");
	}
	public static void stat()
	{
		System.out.println("static-parent");
	}
	public void m1()
	{
		System.out.println("hiiiiiiii-parent");
	}
	public void m2()
	{
		System.out.println("hiiiiiiii2222222-parent");
	}
}
public class OverrideEx extends Parent89
{
	static
	{
		System.out.println("2nd to upload");
	}
	
	{
		System.out.println("object of child");
	}
	OverrideEx()
	{
		System.out.println("constructor of child");
	}
	public static void stat()
	{
		System.out.println("static-child");
	}
	public void m1()
	{
		System.out.println("hiiiiiiii-child");
	}
	public void m3()
	{
		System.out.println("hiiiiiiiiooooo-child");
	}
	public static void main(String[] args) {
		System.out.println("now object creation........");
	Parent89 p=new OverrideEx();
	p.m1();
	p.m2();
	p.stat();
	stat();
	//p.m3();//we cannot run this method because it is not present in parent
	//and if it is not present in parent it dosnt matter it is present in child or not
	OverrideEx o=(OverrideEx)p;
	o.m3();
	o.m2();
	o.stat(); 
	Parent89.stat();
	}

}
