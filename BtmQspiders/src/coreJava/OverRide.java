package coreJava;

public class OverRide {
public void m1(int i)
{
	System.out.println("int argument");
}
public void m1(float f)
{
	System.out.println("float argument");
}
public void m2(Object o1)
{
	System.out.println("Object class");
}
public void m2(String s)
{
	System.out.println("String class child of object will get priority");
}
public void m2(StringBuffer sb)
{
	System.out.println("StringBuffer class child of object have null also");
}
public void m3(int i,float f)
{
	System.out.println("int-float method");
}
public void m3(float f,int i)
{
	System.out.println("float-int method");
}
public void m4(int i)
{
	System.out.println("general int method");
}
public void m4(int...i)
{
	System.out.println("war arg method new int mehod takes array of value");
}
	public static void main(String[] args) 
	{
		OverRide  o=new OverRide();
		o.m1(10);
		o.m1(10.5f);
		o.m1('a');
		//o.m1(10.5);it will look for double type
		o.m2(new Object());
		o.m2("durga");
		//o.m2(null);//ambiguity error if same level class are avilable and looking for same method 
		o.m3(10,10.5f);
		o.m3(10.5f,10);
		//o.m3(10,10);
		//o.m3(10.5f,10.5f);
		o.m4();//war arg
		o.m4(10);//general
		o.m4(10,20,30,40);//war arg
	}

}
