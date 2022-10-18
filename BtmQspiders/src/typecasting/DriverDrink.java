package typecasting;
class Drink
{
	int x=10;
	static String name="banana juice";
	void addThings()
	{
		System.out.println("Drink class");
	}
	
	static void show()
	{
		System.out.println("Drink class static");
	}
	void disp()
	{
		
	}
}
class Juice extends Drink
{
	static void show()
	{
		System.out.println("juice class static");
	}
	void addThings()
	{
		
		System.out.println("Juice class" +name);
		System.out.println(x);
	}
	
	
}
class Shake extends Drink
{
	void addThings()
	{
		System.out.println("Shake class");
	}

	static void show()
	{
		System.out.println("Shake class static");
	}
}
public class DriverDrink {

	public static void main(String[] args) {
		
Drink d=new Drink();
d.addThings();
System.out.println(d.x);
Juice j=new Juice();
j.addThings();
Shake s=new Shake();
s.addThings();
System.out.println("now upcasting and downcasting performed");
Drink d1=new Juice();
d1.addThings();
d1.show();//drink class
//Shake s1=(Shake)d1;
//s1.addThings();
Juice j1=(Juice)d1;
j1.addThings();
j1.show();
	}

}
