package pattern;

import java.util.Scanner;

public class Star2 {
	public static void starPrint1(int num)
	{
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void starPrint2(int num)
{
		int sp=0,st=num;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("* ");
			}
			if(i<=num/2)
			{
			sp++;
			st=st-2;
			}
			else
			{
				sp--;
				st=st+2;
			}
			System.out.println();
		}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines you want to print");
		int num=sc.nextInt();
		starPrint1(num);
		System.out.println("enter for 7 lines star");
		int num1=sc.nextInt();
		starPrint2(num1);
	}

}
