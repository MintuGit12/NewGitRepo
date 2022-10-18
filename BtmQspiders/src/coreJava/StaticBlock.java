package coreJava;
class GF
{
	int y=9000;
	 GF()
	{
		super();
		//this();
		System.out.println("hellooo");
	}
}
public class StaticBlock extends GF {
	static int y=90000;
	static
	{
		m1();
		System.out.println("static block");
		//System.exit(0);
	}
	public void m2()
	{
		System.out.println(super.y);
	}
	public static void m3()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		StaticBlock s=new StaticBlock();
		//StaticBlock.x=200;
System.out.println("hhhiiii");
	}
	static int x=100;
	public static void m1()
	{
		System.out.println(x);
	}
	
	
}
