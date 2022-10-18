package coreJava;
class Test
{
	int c;
	Test(int c)
	{
		this.c=c;
	}
	Test()
	{
		this(60);
	}
}
public class Test1 extends Test
{
	int roll;
	String name;
Test1()
{
	super();
	}
	Test1(int roll,String name)
	{
		this();
		this.name=name;
		this.roll=roll;
		
	}

	public static void main(String[] args) {
		Test1 t=new Test1(10,"Amit");

	}

}
