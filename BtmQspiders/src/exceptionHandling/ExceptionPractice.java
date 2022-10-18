package exceptionHandling;
import java.io.*;
public class ExceptionPractice {
	
public void m1()
{
	try
	{
	System.out.println(10/0);
	}
	/*catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("hiii");
	System.out.println("helooo");*/
	finally
	{
	System.out.println("m here");
	}
}
	public static void main(String[] args) {
		ExceptionPractice e=new ExceptionPractice();
		try
		{
		e.m1();
		}
		catch(Exception e1)
		{
			System.out.println("lets see"+e1);
		}
		

	}

}
