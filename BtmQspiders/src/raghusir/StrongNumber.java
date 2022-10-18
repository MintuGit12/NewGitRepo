package raghusir;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three digit integer number");
		int num=sc.nextInt();
		int a=num;
		int y=0;
		while(num!=0)
		{
			//System.out.println("started");
			int x=1;
			int d=num%10;
			for(int i=d;i>=1;i--)
			{
				x*=i;
			}
			y+=x;
			System.out.println(y);
			num=num/10;
		}
		System.out.println(y+"................");
		if(a==y)
			System.out.println("strong number");
		else 
			System.out.println("not a strong number");
		
	/*	int a=num;
		int c=a%10;
		a=a/10;
		int b=a%10;
		a=a/10;
		int x=1;
		int y=1;
		int z=1;
		for(int i=c;i>=1;)
		{
			x*=i--;
		}
		//System.out.println(x);
		for(int i=b;i>=1;)
		{
			y*=i--;
		}
		//System.out.println(y);
		for(int i=a;i>=1;)
		{
			z*=i--;
		}
		//System.out.println(z);
		if((x+y+z)==num)
		System.out.println("strong number");
		else
			System.out.println("not a strong number");*/
	}

}
