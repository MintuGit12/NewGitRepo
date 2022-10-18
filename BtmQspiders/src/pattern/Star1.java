package pattern;

import java.util.Scanner;

public class Star1 {
public static void starPrint1(int num)
{
	for(int i=1;i<=num;i++)
	{
		for(int j=i;j<=num;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
public static void starPrint2(int num)
{
	for(int i=num;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
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

	}

}
