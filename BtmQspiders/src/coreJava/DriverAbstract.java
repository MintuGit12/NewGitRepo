package coreJava;
abstract class VendingMachine
{
	abstract void getDrink(String s);
	abstract String addElement();
	VendingMachine()
	{
		System.out.println("chining 1st");
	}
}
class Tea extends VendingMachine
{
	
	public String addElement() 
	{
		System.out.println("adding element for tea");
		return "tea";
	}
	String s=addElement();
	public void getDrink(String s) 
	{
		System.out.println("this is the "+s);
	}
      }
class Coffee extends VendingMachine
{
	public String addElement()
	{
		System.out.println("adding element for cofee");
		return "coffee";
	}
	String s=addElement();
	public void getDrink(String s) 
	{
		System.out.println("this is the  "+s);
	}
}
public class DriverAbstract {

	public static void main(String[] args) {
	Tea t=new Tea();
	t.addElement();
	t.getDrink("tea");
	Coffee c=new Coffee();
	c.addElement();
	c.getDrink("coffee");
	}

}
