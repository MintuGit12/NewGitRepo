package raghusir;
import java.util.Scanner;
public class DecimalToBinary {
public static int convert(int num)
{
	int x=0;
	while(num!=0)
	{
		if(num%2!=0)
		{
			x=x+1;
		}
		else
		{
			x=x+0;
		}
		x=x*10;
		num=num/2;
	}
	System.out.println(x);
	return x/10;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int num=sc.nextInt();
		int x=convert(num);
		System.out.println("no is :"+x);
		int y=0;
		while(x!=0)
		{
			
			y+=x%10;
			y=y*10;
			x=x/10;
		}
		System.out.println("binery digit is :"+y/10);
	}

}
