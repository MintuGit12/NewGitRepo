package raghusir;

import java.util.Scanner;

public class AvgOfDig {
public static int avgOfDig(int num)
{
	int n=0;
	int avg=0;
	while(num!=0)//333
	{
		int dig=num%10;
		avg+=dig;
		num=num/10;
		n++;
	}
	return avg/n;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find avarage of digits");
		int num=sc.nextInt();
		System.out.println("avarage of digits in a no is:"+avgOfDig(num));
	}

}
