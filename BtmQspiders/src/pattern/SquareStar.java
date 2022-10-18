package pattern;

import java.util.Scanner;

public class SquareStar {
public static void starPrint1(int num)
{
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=num;j++)
		{
			if(i==1||i==7||i==j||i+j==8||j==1||j==num)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines you want to print");
		int num=sc.nextInt();
		starPrint1(num);
	}

}
