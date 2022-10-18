package coreJava;
class ParA
{
	static void m1()
	{
		System.out.println("method of Parent ");
	}
}
public class MethodShadow {
	static void m1()
	{
		System.out.println("mthod of child");
	}

	public static void main(String[] args) {
		
		 MethodShadow m1=new MethodShadow();
		 m1.m1();
		 m1();
		 MethodShadow.m1();
		 ParA.m1();
		 MethodShadow p=new MethodShadow();
		 p.m1();
	}

}
