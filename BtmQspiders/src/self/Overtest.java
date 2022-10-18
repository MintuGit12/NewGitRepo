package self;


class Parent14
{
	int x=10;
	public void m1()
	{
		System.out.println(x);
	}
}
class Child14 extends Parent14
{
	int x=9999;
	public void m1()
	{
		System.out.println(x);
	}
}
public class Overtest {

	public static void main(String[] args) {
		Parent14 p1=new Parent14();
		Parent14 p=new Child14();
		p.m1();
	}
}
