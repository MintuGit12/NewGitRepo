package self;
class A22
{
private static int a;
public static int get()
{
	return a;
}
private  void set(int a)
{
	this.a=a;
}
void show(int y)
{
	set(y);
}
}
public class Private {

	public static void main(String[] args) {
		A22 a1=new A22();
		a1.show(10);
		System.out.println(A22.get());
	}

}
