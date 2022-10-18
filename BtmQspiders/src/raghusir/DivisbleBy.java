package raghusir;
import java.util.Scanner;
public class DivisbleBy{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("enter one Integer number");
	int num=s.nextInt();
	if(num%3==0&&num%4==0&&num%5==0)
	{
		System.out.println("number is divisble by 3,4,5 all");
	}
	else
	{
		System.out.println("number is not divisivble by all three 3,4,5 number");
	}
	}

}
