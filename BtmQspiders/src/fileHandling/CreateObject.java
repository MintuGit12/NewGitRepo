package fileHandling;

public class CreateObject {
	static int y;
	int x;
public CreateObject create()
{
	CreateObject c=new CreateObject();
	c.x=10000;
	c.y=4500;
	return c;
}
	public static void main(String[] args) {
		CreateObject ob=new CreateObject();
		CreateObject ob1=ob.create();
		System.out.println(ob1.x);
		System.out.println(ob1.y);

	}

}
