package self;
abstract class A99
{
 void m1()
 {
	 System.out.println("hiiiii");
 }
}

public class AbstractTest extends A99 {

	public static void main(String[] args) {
	A99 a=new  AbstractTest();
	a.m1();

	}

}
