//register to parent class of child class
package coreJava;
abstract class Base
{
	abstract  void register(Child c);
	public void show()
	{
		System.out.println("show method of parent class");
	}
}
public class Child extends Base
{
void register(Child c)
{
	c.disp();
	c.show();
}
public void disp()
{
	System.out.println("this is display method");
}
	public static void main(String[] args) {
Child c1=new Child();
c1.register(c1);
	}

}
