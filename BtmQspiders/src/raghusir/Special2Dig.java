package raghusir;

import java.util.Scanner;

public class Special2Dig
{
	public static void special(int no)
	{
		int num=no;
		int a=0;
			a=no%10;
			no=no/10;
		if((no*a)+(no+a)==num)
			System.out.println("special 2 dig no");
		else
			System.out.println("not a special 2 dig no");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int nu=sc.nextInt();
		special(nu);
	}

}
