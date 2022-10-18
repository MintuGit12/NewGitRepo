package self;

public class NonStaticFromStatic
{
	int x=200;

	public static void main(String[] args) {
		NonStaticFromStatic n=new NonStaticFromStatic();
		System.out.println(n.x);

	}

}
