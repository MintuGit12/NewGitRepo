package pattern;

import java.util.Scanner;

public class Star5 
{
	public static void starPrint1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void starPrint2(int n)
	{
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			st=st+2;
			System.out.println();
		}
	}
	public static void numPrint3(int n)
	{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++)
		{
			System.out.print(j+"");
		}
		System.out.println();
	}
	}
	public static void numPrint4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
	public static void numPrint5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
	public static void numPrint6(int n)
	{
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i-1;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++)
		{
			System.out.print(j+"");
		}
		System.out.println();
	}
	}
	public static void starPrint7(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines you want to print");
		int num=sc.nextInt();
		starPrint1(num);
		starPrint2(num);
		numPrint3(num);
		numPrint4(num);
		numPrint5(num);
		numPrint6(num);
		starPrint7(num);
	}

}
