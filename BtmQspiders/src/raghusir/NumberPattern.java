package raghusir;
import java.util.Scanner;
public class NumberPattern {
public static void reverseNum(int num)
{
	reverseNum2(num);
	for(int i=num;i>=1;i--)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void reverseNum2(int num)
{
	num(num);
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print(num-i+1+" ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void num(int num)
{
	star(num);
	for(int i=1;i<=num;i++)
	{
		for(int j=num;j>=1;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void star(int num)
{
	star2(num);
	int k=1;
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=k;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		k++;
	}
	System.out.println();
}
public static void star2(int num)
{
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reverse no you want to print");
		int num=sc.nextInt();
		reverseNum(num);
	}

}
