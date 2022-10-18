package raghusir;

import java.util.Scanner;

public class FcatorialOfNum {
	public static int fact(int num)
	{
		int res=0;
		while(num!=0)
		{
		res=num;
		res*=(--num);
		num=--num;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
System.out.println(fact(num));
	}

}
