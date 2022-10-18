package exceptionHandling;
import java.util.Scanner;
public class Exception1st {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			int num=a/b;
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println("exception successfully handeled :"+e);
		}
		int num1=a*b;
		System.out.println("multiplication of no :"+num1);
	}

}
