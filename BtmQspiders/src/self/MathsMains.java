package self;

import java.util.Scanner;

public class MathsMains {
public static boolean isPrime(int num)
{
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
			return false;
	}
	return true;
}
public static int sumPrime(int num)
{
	int sum=0;
	for(int i=2;i<num;i++)
	{
		if(isPrime(i)==true)
		{
			sum+=i;
		}
	}
	return sum;
}
public static void isPattern1()
{
	int k=97;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)k+" ");
			k++;
		}
		System.out.println();
	}
}
public static void isPattern2(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||i==n||j==1||j==n)
				System.out.print("* ");
		}
		System.out.println();
	}
}
public static void isPattern3()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1||i==5||j==1||j==5||j==i||j+i==6)
				System.out.print("* ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number :");
	int num=sc.nextInt();
	/*if(isPrime(num)==true)
		System.out.println("prime");
	else
		System.out.println("not prime");*/
	System.out.println("Prime num sum under "+num+" = "+sumPrime(num));
	isPattern1();
	System.out.println("entwr the pattern line :");
	int n=sc.nextInt();
	isPattern2(n);
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	isPattern3();
	}

}
