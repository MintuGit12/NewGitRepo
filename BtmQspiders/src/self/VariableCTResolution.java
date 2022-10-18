package self;
class A55
{
	static int x=777;
}
class B55 extends A55
{
	static int x=888;
}
class C55 extends B55
{
static int x=999;	
}
public class VariableCTResolution {

	public static void main(String[] args) {
C55 c=new C55();
System.out.println(c.x);//999
System.out.println(((B55)c).x);//888
System.out.println(((A55)((B55)c)).x);//777
	}

}
