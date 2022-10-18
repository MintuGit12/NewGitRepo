package self;
class A
{
	
}
class B extends A
{
	
}
public class DiffTypeCast extends B {

	public static void main(String[] args) {
		B b=new DiffTypeCast();
		A a=(A)b;
		
	}
}
