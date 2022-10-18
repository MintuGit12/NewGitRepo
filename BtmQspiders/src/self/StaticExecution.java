package self;
//static control flow
public class StaticExecution {
static int i=10;//1.read indirectly write only(i=0)//7.i=10
static//2
{
	m1();//8.j=0
	System.out.println("first static block");//10
}
	public static void main(String[] args)//3
	{
m1();//13.op-20
System.out.println("main method");//15
	}
	public static void m1()//4
	{
		System.out.println(j);//9//14
	}
	static//5
	{
		System.out.println("second static block");//11
	}
	static int j=20;//6.j=0;//12.j=20

}
