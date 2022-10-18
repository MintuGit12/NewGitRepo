package self;

public class InstanceExecution {
int x=20;
{
	m1();
	System.out.println("1st instance block");
	}
InstanceExecution()
{
	System.out.println(j);
	System.out.println("constructor is also non static");
}
	public static void main(String[] args)//1st static mehodexecute thats y main method
	{
		InstanceExecution i=new InstanceExecution();
		System.out.println("main method static");//static block exection part
	}
	public void m1()
	{
	System.out.println(j);	
	}
	{
		System.out.println("2nd instance block");
	}
	int j=799;
}/*op is
0
1st instance block
2nd instance block
799
constructor is also non-static
main method static*/

