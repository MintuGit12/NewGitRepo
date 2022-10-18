package coreJava;
class Applinces
{
	String capacity;
	String size;
	Applinces(String capacity,String size)
	{
		this.capacity=capacity;
		this.size=size;
	}
}
class Television extends Applinces
{
	
	String type;
	Television(String capacity,String size,String type)
	{
		super(capacity,size);
		this.type=type;
	}
}
class WashingMachine extends Applinces
{
	
	String type1;
	WashingMachine(String capacity,String size,String type1)
	{
		super(capacity,size);
	this.type1=type1;
	}
}
public class ApplinceTest {

	public static void main(String[] args) 
	{
	
Applinces w=new WashingMachine("220l","large","automatic");
Applinces w1=new Television("220l","large","color tv");
	}

}
