package pattern;

import java.util.Scanner;

public class MegaStar {
public static void starPrint1(int n)
{
	
	for(int i=n;i>=1;i--)
	{
		if(i<=n/2)
		{
	for(int j=1;j<=i/2+1;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i*2-1;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
	}
		
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines you want to print");
		int num=sc.nextInt();
		starPrint1(num);

	}

}
