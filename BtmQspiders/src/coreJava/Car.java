package coreJava;
import java.util.Scanner;
class Vehicle
{
static String brand;
 int price;
public void show(String brand,int price)
{
	this.brand=brand;
	this.price=price;
	System.out.println("its a vehicle");
	System.out.println("brand of the parent car is "+brand);
	System.out.println("price of the parent car is "+price);
}
}
public class Car extends Vehicle
{
	public void show1(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
		System.out.println("its a vehicle");
		System.out.println("brand of the child car is "+brand);
		System.out.println("price of the child car is "+price);
	}
	public static void main(String[] args)
	{
		Car c=new Car();
		c.brand="medcedez";
		c.show("medcedez",4000000);
		Vehicle v=new Car();
		v.show("auddy",5600000);
		Vehicle v1=new Vehicle();
		v1.show("maruti",300000);
		//v1.show1("maruti",300000);
		//System.out.println("price of the vehicle is "+price);private variable cannot be extended
		System.out.println("brand of the car is "+brand);//non private 	
	}
}

