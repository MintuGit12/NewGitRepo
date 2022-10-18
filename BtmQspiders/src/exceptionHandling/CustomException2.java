package exceptionHandling;
import java.util.*;
class Except extends RuntimeException
{
	Except(String s)
	{
		super(s);
	}
}
public class CustomException2 {
public static void exam(int marks)
{
	try
	{
	if(marks<0||marks>100)
	{
	System.out.println("not handled");	
	}
	}
	catch(Except e)
	{
		System.out.println("default massage will be printed");
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the valid marks");
		int marks=sc.nextInt();
		exam(marks);

	}

}
