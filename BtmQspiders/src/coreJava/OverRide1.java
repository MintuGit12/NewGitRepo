package coreJava;
class Animal
{
	
}
class Monkey extends Animal
{
	
}
public class OverRide1 
{
	public void m1(Animal a)
	
		System.out.println("animal type object");
	}
	public void m1(Monkey m)
	{
		System.out.println("Monkey is a child of animal type object");
	}

	public static void main(String[] args) 
	{
		OverRide1 o=new OverRide1();
		o.m1(new Animal());
		o.m1(new Monkey());
		Animal a=new Monkey();
		o.m1(a);//
	}

}
