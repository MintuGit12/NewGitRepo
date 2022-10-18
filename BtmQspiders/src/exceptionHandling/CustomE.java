package exceptionHandling;
import java.io.*;
import java.util.Scanner;
class ExceptionAge extends RuntimeException
{
	ExceptionAge(String s)
	{
		super(s);
	}
}
public class CustomE {
	
	public void m1()
	{
		try
		{
		int x=100/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
public void showAge(int age)
{
	if(age<18)
	{
		throw new ExceptionAge("age is not valid....enter valid age");
	}
	else
	{
		System.out.println("you can enroll in the program");
	}
		
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age :");
		int age=sc.nextInt();
		CustomE e=new CustomE();
		try
		{
			e.showAge(age);
		}
		catch(ExceptionAge e1)
		{
			System.out.println(e1);
		}
		finally
		{
			e.m1();
			System.out.println("this block will execute either exception is there or not");
			
		}

	}

}
