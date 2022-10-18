package raghusir;

import java.util.Scanner;

public class SumOfSquareOfDig {
public static int digSquare(int num)
{
	int res=0;
	while(num!=0)
	{
		res+=(num%10)*(num%10);
		num=num/10;
	}
	return res;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("product of all the digit:"+digSquare(num));

	}

}
