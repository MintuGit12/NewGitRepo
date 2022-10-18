package typecasting;
class Parent
{
	static void m1()
	{
		System.out.println("hiiiiiii");
	}
	void m2()
	{
		System.out.println("hiiii222222222");
	}
}
public class CastingStatic extends Parent 
{
	static void m1()
	{
		System.out.println("hlooooooooooo");
	}
	void m2()
	{
		System.out.println("hlooooooooo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new CastingStatic();
p.m1();
p.m2();
CastingStatic c1=(p)CastingStatic;
	}

}
