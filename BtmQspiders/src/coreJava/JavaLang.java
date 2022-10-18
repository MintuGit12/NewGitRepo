package coreJava;
import java.util.Scanner;
class Lang
{
	private String author;
	private String name; 
public void m1()
{
	System.out.println("Programing language");
	System.out.println(name);
}
public void setVal(String author,String name)
{
	this.author=author;
	this.name=name;
}
public String getVal()
{
	return author;
}
public String getVal1()
{
	return name;
}
}
class ProgLang extends Lang
{
	private void m2() {
		System.out.println("prog lang and programing language both");

	}
}
public class JavaLang extends ProgLang
{
	public void m3()
	{
		System.out.println("grand,parrent child method");
	}
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	JavaLang j=new JavaLang();
	j.setVal("r nageshwar rao","java book");
	j.m1();
	System.out.println(j.getVal());
}
}
