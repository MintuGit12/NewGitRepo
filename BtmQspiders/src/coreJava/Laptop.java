package coreJava;
import java.util.Scanner; 
class Laptop 
{
static String ram="4GB";
float price;
String brand;
String color;
Laptop(String color,float price,String brand)
{
	this.price=price;
	this.brand=brand;
	this.color=color;
}
Laptop(float price,String color,String brand)
{
	this.price=price;
	this.brand=brand;
	this.color=color;
}
public void show()
{
System.out.println("color is "+color);
System.out.println("price is "+price);
System.out.println("brand is "+brand);
System.out.println("RAM of the laptop is"+ram);
}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the price of laptop you want");
		float price=s.nextFloat();
		System.out.println("enter the brand you want");
		String brand=s.nextLine();
		s.nextLine();
		System.out.println("enter the color you want");
		String color=s.next();
		Laptop l1=new Laptop(price,color,brand);
		l1.show();
		System.out.println("enter the price of laptop you want");
		price=s.nextFloat();
		System.out.println("enter the brand you want");
		brand=s.nextLine();
		s.nextLine();
		System.out.println("enter the color you want");
		s.nextLine();
		color=s.next();
		Laptop l2=new Laptop(color,price,brand);
		l2.show();
		s.close();
	}

}
