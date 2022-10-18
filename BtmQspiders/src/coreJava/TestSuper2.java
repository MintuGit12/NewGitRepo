//implicit super used
package coreJava;
class Animal2
{
	Animal2(int x)
	{
		System.out.println("animal is createddddddd");
	}
	Animal2()
	{this(13);
		System.out.println("animal is created");
	}
}
class Dog2 extends Animal2
{
	Dog2()
	{
	this(14);
		System.out.println("dog is created");
	}
	Dog2(int y)
	{
	
		System.out.println("dog is createddddd");
	}
}
public class TestSuper2 {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
	

	}

}
