package coreJava;
import java.util.Scanner;
interface IT
{
	int x=900;
	//void current();
	void flux();
}
abstract class Electric implements IT
{
	 String brand;
	int price;
	Electric( String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	abstract void run();
	abstract void validity();
	public void m1()
	{
		System.out.println("abstract class");
	}
}
class EBulb11 extends Electric
{
	static String color;
	public  void m111()
	{
		System.out.println(color);
	}
	EBulb11( String brand,int price,String color)
	{
		super(brand,price);
		this.color=color;
	}
	public void flux()
	{
		System.out.println(x);
	}
	void run()
	{
		System.out.println(brand+" "+price+" "+color);
	}
    void validity()
	{
		System.out.println("one year");
	}
}
public class DriverElectric  {
	
	public static void main(String[] args) {
EBulb11 d=new EBulb11("phillips",56,"red");
d.m1();
d.run();
d.flux();
	}

}
