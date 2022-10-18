package exceptionHandling;

import java.util.Scanner;
public class ExExceptionMany 
{
public static void sum(int a,int b)
{
	int x=0;
	try
	{
		 x=a/b;
		System.out.println(x);
	}
	catch(Exception e)
	{
		try
		{
		int y=x/b;
		System.out.println(y);
		}
		catch(Exception e1)
		{
			System.out.println("now finally will occur");
		}
	}
	finally
	{
		System.out.println(a+b);
	}
}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum(a,b);
		System.out.println("now its time for AIOOB exception");
		int []arr=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		try
		{
			for(int i=0;i<=arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println(e);
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
