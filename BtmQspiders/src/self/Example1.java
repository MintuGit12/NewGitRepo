package self;

public class Example1 {
	static int x=100;
	int y=900;
public static void m1()
{
	Example1 e=new Example1();
	System.out.println(x);
	System.out.println(e.y);
}
	public static void main(String[] args) {
		Example1 e=new Example1();
		e.m1();

	}

}
