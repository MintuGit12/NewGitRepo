package self;
class A
{
	static int x=B.y;
}
class B
{
	static int y=C34.z;
}
class C34
{
	static int z=TightlyCoupled.m1();
}
public class TightlyCoupled 
{
	public static int m1()
	{
		int x=10;
		int y=200;
		return x*y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(A.x);

	}

}
