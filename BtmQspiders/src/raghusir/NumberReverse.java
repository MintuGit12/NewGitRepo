package raghusir;

import java.util.Scanner;

public class NumberReverse {
public static void reverseNum(int num)
{
	int rev=0;
	while(num!=0)
	{
		System.out.print(num%10);
		num=num/10;
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		reverseNum(num);

	}

}
