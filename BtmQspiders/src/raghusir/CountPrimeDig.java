package raghusir;

import java.util.Scanner;

public class CountPrimeDig {
	public static long count(long num)
	{
		long count=0;
		do
		{
			int d=num%10;
			if(d==1||d==2||d==3||d==5||d==7)
				count++;
			num=num/10;
		}while(num>0);
			return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find prime digit in a number");
		long num=sc.nextInt();
		System.out.println("the no of prime dig in a no is :"+count(num));
	}

}
