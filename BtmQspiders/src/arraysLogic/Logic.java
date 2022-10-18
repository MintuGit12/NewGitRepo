package arraysLogic;
interface A
{
	void test();
}
 class Logic1 implements A {
	public void test()
	{
		System.out.println("hiii");
	}

}
 class C extends Logic1{
	
	
}
public class Logic
 {
	 public static void main(String[] args)
	 {
		 C l=new C();
		 l.test();
	 }
 }