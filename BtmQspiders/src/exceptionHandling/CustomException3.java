//it needed we can create our own exception and handle in the exception situation
package exceptionHandling;
import java.io.*;
class A extends RuntimeException
{
	A(String s)
	{
		super(s);
	}
}
public class CustomException3 {
public static void checkAge(int age)
{
	if(age<18)
	{
		throw new A("age is invalid");
	}
	else
		System.out.println("go ahead");
	test();
}
	public static void main(String[] args) {
		int age=17;
		try
		{
			checkAge(age);
		}
catch(A a)
		{
	System.out.println(a);
		}
	}
	public static void test()
	{
		System.out.println("helllooooooooo");
	}

}
