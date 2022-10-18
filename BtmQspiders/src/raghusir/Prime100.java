package raghusir;

import java.util.Scanner;

public class Prime100 
{
	public static boolean isPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
public static void prime(int num)
{
	int sum=0;
	int count=0;
	for(int k=1;k<=num;k++)
	{
		if(isPrime(k)==true)
		{
			count++;
			sum=sum+k;
          System.out.println(k);
			
		}
	}
	System.out.println("all prime no are "+count);
	System.out.println("sum of all prime no are "+sum);
	System.out.println("all non prime no are "+(num-count));
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numberupto 100 to find prime number");
		int num=sc.nextInt();
		prime(num);
	}

}
