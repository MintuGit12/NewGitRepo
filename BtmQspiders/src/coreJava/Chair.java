package coreJava;
import java.util.Scanner;
public class Chair
{
double price;
String brand;
String type;
Chair(double price,String brand,String type)
{
	System.out.println("new Object initialised");
	this.price=price;
	this.brand=brand;
	this.type=type;
}
Chair()
{
}
{
	System.out.println("new Object is created by the help of new Keyword");
}
static
{
	System.out.println("Chair defination is started");
}
public void show()
{
	//Chair ch=new Chair(545.45,"Ajanta","home");
	System.out.println("price is "+price);
	System.out.println("brand of the chair is "+brand);
	System.out.println("type of the chair is "+type);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("type of the chair is");
String type=s.nextLine();
System.out.println("price of the chair");
double price=s.nextInt();
System.out.println("brand of the chair is");
s.nextLine();
String brand=s.nextLine();
Chair ch=new Chair(price,brand,type);
ch.show();
	}

}