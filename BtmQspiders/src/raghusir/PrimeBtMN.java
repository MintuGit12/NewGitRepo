package raghusir;

import java.util.Scanner;

public class PrimeBtMN {
	public static boolean isPrime(int i)
	{
		for(int j=2;j<=i/2;j++)
		{
			if(i/j==0)
				return false;
		}
		return true;
	}
public static void prime(int m,int n)
{
	int sum=0;
	int count=0;
	for(int i=m;i<=n;i++)
	{
		if(isPrime(i)==true)
		{
			System.out.println(i);
			count++;
			sum=sum+i;
		}
		
	}
	System.out.println("all prime no are "+count);
	System.out.println("sum of all prime no are "+sum);
	System.out.println("all non prime no are "+((n-m)-count));
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lowest and highest num to find prime bt them");
		int m=sc.nextInt();
		int n=sc.nextInt();
		prime(m,n);
	}

}
