package self;
abstract class Parent45
{
	abstract void m1();
}
public class AbsStatic extends Parent45 {
	void m1()
	{
		System.out.println("hiiiii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//m1();
Parent45 p =new AbsStatic();
p.m1();
	}

}
