package raghusir;

import java.util.Scanner;

public class ArmstrongNum {
public static boolean armstrong(int num)
{
	int mux=1;
	int sum=0;
	int count=0;
	int n=num;
	int nu=n;
	while(num!=0)
	{
	int d=num%10;
	num=num/10;
	count++;
	}
	while(n!=0)
	{
		int f=n%10;
	for(int i=1;i<=count;i++)//133
	{
	mux=mux*f;
	}
	sum+=mux;
	mux=1;
	n=n/10;
	}
	return sum==nu;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find armstrong num");
		int num=sc.nextInt();
	if(true==armstrong(num))
		System.out.println("armstrong numer");
	else
		System.out.println("not an armstrong num");
	}

}
