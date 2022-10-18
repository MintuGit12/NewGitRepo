package coreJava;

abstract class ElectricSwitch
{
	String brand;
	float price;
	abstract public void price(); 
	abstract public void brand();
	ElectricSwitch()
	{
		
	}
	ElectricSwitch(String brand,float price)
	{
		this.brand=brand;
		this.price=price;
	}
}
public class EBulb extends ElectricSwitch
{
	String bbrand;
	String type;
	EBulb(String bbrand,String type,String brand,float price)
	{
		super(brand,price);
		this.bbrand=bbrand;
		this.type=type;
	}
public void price()
{
	System.out.println("price is "+price);
	System.out.println("type is "+type);
}
public void brand()
{
	System.out.println("brnad of bulb is "+bbrand);
	System.out.println("brnad of electricswitch is "+brand);
}
	public static void main(String[] args) {
		
		ElectricSwitch e=new EBulb("anchor","led","phillips",134.5f);
		e.brand();
		e.price();
	}

}
