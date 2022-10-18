package ExamQstn;

public class LocalInnerClass {
	int x=990;
	static int y=9834;
 class Local
{
	static int x1=789;
	int y1=2345;
	void m1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(x1);
		System.out.println(y1);
	}
}
	public static void main(String[] args) {
		LocalInnerClass l=new LocalInnerClass();
		LocalInnerClass.Local l1=l.new Local();
		l1.m1();
	}

}
