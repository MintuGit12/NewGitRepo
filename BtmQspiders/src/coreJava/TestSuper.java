package coreJava;
class Animal1
{

	String color="pink";
	public void show()
	{
		System.out.println("parent class method through show");
	}
}
class Animal11 extends Animal1
{
	String color=super.color;
	public void show()
	{
		super.show();
	}
}
class Dog extends Animal11
{
	String color="Blackkk";
	public void disp()
	{
		System.out.println(color);
		System.out.println(super.color);
		super.show();
	}
}
public class TestSuper {

	public static void main(String[] args) {
Dog d=new Dog();
d.disp();

	}

}
