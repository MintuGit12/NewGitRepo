package self;
class Parent566
{
	static int x=200;
	int y=400;
	public static void m1()
	{
		System.out.println(x);
		System.out.println("hii");
	}
}
public class DatamemberInherit extends Parent566 {

	public static void main(String[] args) {
		DatamemberInherit d=new DatamemberInherit();
		//d.y=200;
		System.out.println(d.y);
		System.out.println(x);
		m1();

	}

}
