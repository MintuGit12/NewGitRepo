package self;
class Parent
{
	public void m1(int x)
	{
		System.out.println("parent method");
	}
}
public class OverrideLoop extends Parent
{
/*public void m1(int l)
{
	System.out.println("child class");
}*/
public static static void m1(long l)
{
	System.out.println("child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideLoop o=new OverrideLoop();
		o.m1(0);
	}

}
