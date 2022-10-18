package exceptionHandling;
import java.util.*;
public class ArrayException {
	public void m3()
	{
		System.out.println("ae1.........");
	}
	public static void m1()
	{
		ArrayException ae1=new ArrayException();
		ae1.m3();
		System.out.println("hii");
	}
	public void m2()
	{
		m1();
		System.out.println("hellooo");
	}
	public void m4()
	{
		try
		{
			int x=100/0;
			System.out.println(x);
		}
		catch(Exception e)
		{
			System.out.println("exceptio okkk");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayException a=new ArrayException();
		a.m2();
		try
		{
		a.m4();
		}
		catch(Exception e)
		{
			System.out.println("it will not execute");
		}
		/*System.out.println("enter the length of the array");
		int le=sc.nextInt();
		int[] arr=new int[le];
		System.out.println("initialize the array");
		for(int i=0;i<le;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(arr);
		try
		{
			for(int i=0;i<=le;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("exception happened");
		}
		finally
		{
			for(int i=0;i<le;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("if exception happens it will print");
		}*/
	}

}
