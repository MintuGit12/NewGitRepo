package raghusir;
//sum of square of digits until it becomes single digt and if single digit is 1,7 happy no
//ex 310, 70, 86, 130, 7, 5555, 1212, 13, 1000
import java.util.Scanner;
class HappyNumber
{
public static boolean isHappy(int num)
{
	do
	{
		num=sumOfSq(num);
	}while(num>9);
	return num==1||num==7;
}
public static int sumOfSq(int num)
{
	int sum=0;
	while(num!=0)
	{
	int d=num%10;
	sum=sum+d*d;
	num=num/10;
	}
	return sum;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find happy number");
		int num=sc.nextInt();
		if(isHappy(num)==true)
		System.out.println("number is a happy number");
		else 
			System.out.println("number is not a happy number");
	}

}
