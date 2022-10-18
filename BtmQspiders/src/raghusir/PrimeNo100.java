package raghusir;

import java.util.Scanner;

public class PrimeNo100 {
public static int prime100(int num)
{
	int count =0;
	for(int i=1;i<=num;i++)
	{
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				count++;
				System.out.println(i+"is not a prime no");
				break;
			}
		
		}
	}
	return num-count;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numberupto 100 to find prime number");
		int num=sc.nextInt();
		System.out.println("total prime no upto entered number is is:"+prime100(num));
	}

}
