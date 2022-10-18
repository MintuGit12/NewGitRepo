package coreJava;

interface ESwitch
{
	void switchOnn();
	void switchOff();
}
abstract class Bulb implements ESwitch
{
	String brand;
	int price;
	Bulb()
	{
	super();
	System.out.println("Bulb default costructor");
	}
	Bulb(String brand,	int price)
	{
		this();
		this.brand=brand;
		this.price=price;

	}
	public void bShow()
	{
		System.out.println("Bulb class show method");
	}
}
class EFan extends Bulb
{
	EFan()
	{
		System.out.println("EFan default const");
	}
	EFan(String brand,	int price)
	{
		
		super(brand,price);
		
	}
	public void bShow()
	{
		System.out.println("EFAn class show method");
	}
public void switchOnn()
{
	System.out.println("swich is onn and brand is "+brand);
	
}
public void switchOff()
{
	System.out.println("swich is off and price is "+price);
	
}
}
abstract class EWMachine
{
	abstract void switchOff();
}
public class DriverSwitch {

	public static void main(String[] args) {
		ESwitch e=new EFan("philips",90);
		e.switchOnn();
		e.switchOff();
		Bulb b=new EFan();
		b.bShow();
	}

}
