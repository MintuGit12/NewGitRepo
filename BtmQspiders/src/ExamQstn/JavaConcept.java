package ExamQstn;
interface Inter
{
	public void m11();
	public static void main(String[] args) {
		System.out.println("hiiiii");
		Inter i=new Inter() {

			@Override
			public void m11() {
			System.out.println("interface overridden");
				
			}};
			i.m11();
	}		
}
	

class A implements Inter
{
	static {
		System.out.println("parent");
		//x=100099;
	}
	public static void o1()
	{
		System.out.println("loooo");
	}
	 final int x;
	public void m1()
	{
		System.out.println(x);
		
	}
	A()
	{
		x=3000;
	}
	public static void main(String[] args)
	{
	Inter i=new A();
	i.m11();
	}
	@Override
	public void m11() {
		// TODO Auto-generated method stub
		
	}
	
}
public class JavaConcept extends A {
 int x=100;
 public static void  o1(int l)
 {
	 
 }
 static
 {
	 System.out.println("child");
 }
/*public void m1()
{
	System.out.println(x);
	//System.out.println(A.x);
}*/
	

}
