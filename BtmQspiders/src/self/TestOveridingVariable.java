package self;
class Par
{
	int x=888;
	static int y=777;
}
class Chi extends Par
{
	int x=999;
	static int y=666;
}
public class TestOveridingVariable {

	public static void main(String[] args) {
		Par p=new Par();
		System.out.println(p.x);//888 
		Chi c=new Chi();
		System.out.println(c.x);//999
		System.out.println(c.y);//666
		Par p1=new Chi();
		System.out.println(p1.x);//888
		System.out.println(p1.y);//777
	}

}
