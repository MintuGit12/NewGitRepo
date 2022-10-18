package raghusir;
import java.util.Scanner;
public class SumOfDigits {
public static int sumOfDig(int num)
{
	int sum=0;
	while(num!=0)
	{
		sum+=num%10;
		num=num/10;
	}
	return sum;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("sum of all the digits in a number is :"+sumOfDig(num));
	}

}
