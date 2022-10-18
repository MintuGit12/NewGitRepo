package raghusir;
import java.util.Scanner;
public class SpecialTwoDigit {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter any integer number");
		int num=s.nextInt();
		int d1=num/10;
		int d2=num%10;
		int sum=d1+d2+d1*d2;
		if(sum==num)
		{
			System.out.println("it is a special no:"+num);
		}
		else
		{
			System.out.println("it is not a special no:"+num);
		}
	}

}
