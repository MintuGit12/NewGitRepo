package exceptionHandling;
import java.util.*;
class ExException extends RuntimeException
{
	ExException(String s)
	{
		super(s);
	}
}
public class CustomException {
	public static void test()
	{
	System.out.println("run after handling of exception");
	}
public static void checkAge(int age)
{
	if(age<18)
		{
		throw new ExException("your age is not eligible.............");
		}
	else
	{
		System.out.println("you are eligible");
	}
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
	try
	{
	checkAge(age);	
	}
	catch(ExException e)
	{
		System.out.println("exception is handled :"+e);
		e.printStackTrace();
	}
	test();
	}

}
