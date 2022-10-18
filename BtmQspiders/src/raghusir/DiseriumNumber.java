package raghusir;
//diserium num-number whose sum of digits position power=number(89,175,518)
import java.util.Scanner;

public class DiseriumNumber {
public static boolean isDiseriumNumber(int num)
{
	int count=count(num);
	int sum=0;
	int temp=num;
	do
	{
		int d=num%10;
		sum=sum+pow(d,count);
		count--;
		num=num/10;
	}while(num!=0);
	return sum==temp;
}
public static int count(int num)
{
	int cou=0;
	while(num!=0)
	{
		num=num/10;
		cou++;
	}
	return cou;
}
public static int pow(int d,int count)
{
	int mux=1;
	while(count!=0)
	{
		mux*=d;
		count--;
	}
	return mux;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find diserium number");
		int num=sc.nextInt();
		if(isDiseriumNumber(num)==true)
			System.out.println("its a deserium number");
		else
			System.out.println("its not a deserium number");
	}

}
