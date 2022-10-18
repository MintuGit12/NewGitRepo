package raghusir;
//Strong number is 145=1!+4!+5!;
import java.util.Scanner;

public class StrongNumber2 {
public static boolean isStrongNum(int num)
{
	int temp=num;
	int sum=0;
	while(num!=0)
	{
		int n=1;
		int d=num%10;
		for(int i=1;i<=d;i++)
		{
			n*=i;
		}
		sum=sum+n;
		num=num/10;
	}
	return sum==temp;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find Strong number");
		int num=sc.nextInt();
		if(isStrongNum(num)==true)
			System.out.println("its a strong number");
		else
		System.out.println("its not a strong number");
	}

}
