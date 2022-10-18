package coreJava;

public class Testoverloading2 {
	static void values(String name)
	{
	System.out.println("name is "+name);	
	}
	static void values(String name,int age)
	{
		System.out.println("name is "+name+" age is "+age);
	}
	static void values(int age,String name)
	{
		System.out.println("age is "+age+" name is "+name);
	}
	static void values(String name,String place)
	{
		System.out.println(name+" is name  "+place+" is place");
	}

	public static void main(String[] args) {
		
		values("rohan");
		values("rohan","banglore");
		values(30,"rohit");
		values("rohit",30);
	}

}
