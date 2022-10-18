package raghusir;
import java.util.*;
public class MainPatternStar {
public static void pattern(int num)
{
	for(int i=2;i<=num;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void numPattern(int num)
{
	numPattern2(num);
	for(int i=1;i<=num;i++)
	{
		
		for(int j=1;j<=num;j++)
		{
			System.out.print(i+" ");		
		}
		System.out.println();
	}
	System.out.println();
}
public static void numPattern2(int num)
{
	binery(num);
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void binery(int num)
{
	num(num);
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print(i%2+" ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void num(int num)
{
	binery2(num);
	for(int i=0;i<=num;i++)
	{
		for(int j=2;j<=num;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void binery2(int num)
{
	for(int i=1;i<=num;i++)
	{
		for(int j=2;j<=num;j++)
		{
			System.out.print(j%2+" ");
		}
		System.out.println();
	}
	System.out.println();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of liles you want to print");
		int num=sc.nextInt();
		pattern(num);
		numPattern(num);
	}

}
