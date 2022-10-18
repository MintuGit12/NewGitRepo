package ExamQstn;


public class InnerClass {
	int x=19967;
	static int y=9780;
	static class A
{
	int x1=1990;
	static int y1=900;
public void m1()
{
	System.out.println(x1);
	System.out.println(y);
	//System.out.println(x);
	System.out.println(y);
}
}
class B
{
static int x=100;	
}
	public static void main(String[] args)
	{
	System.out.println(InnerClass.A.y1);
	InnerClass.A a=new InnerClass.A();
	System.out.println(a.x1);
	a.m1();
	}
	}

