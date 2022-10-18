package raghusir;

import java.util.Scanner;

public class TotalPrimeDig {
public static int totalPrime(int num)
{
	int count=0;
while(num!=0)
{
		int d=num%10;//153
		count=count+div(d);
		num=num/10;
}
return count;
}
public static int div(int d)
{
	for(int i=2;i<=d/2;i++)
	{
		if(d%i==0)
		return 0;
}
	return 1;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		System.out.println("total no of prime digit in number :"+totalPrime(num));
	}

}
