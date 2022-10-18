package raghusir;
//num whose sum is equals to power to to its dig present in num=num; 
import java.util.Scanner;

public class ArmstrongNumber2 {
public static boolean isArmstrong(int num)
{
	int sum=0,temp=num;
	int count =count(num);
	do
	{
		int d=num%10;
		sum=sum+mux(d,count);
		num=num/10;
	}while(num!=0);
	return sum==temp;
}
public static int count(int num)
{
	int co=0;
	while(num!=0)
	{
		num=num/10;
		co++;
	}
	return co;
}
public static int mux(int d,int count)
{
	int mux=1;
	do
	{
		mux*=d;
		count--;
	}while(count>0);
	return mux;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find armstrong num");
		int num=sc.nextInt();
		if(isArmstrong(num)==true)
				System.out.println("it is armstrong number");
		else
			System.out.println("nuber is not an armstrong number");

	}

}
