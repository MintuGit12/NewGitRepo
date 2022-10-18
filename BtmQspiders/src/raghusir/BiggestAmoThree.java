package raghusir;

import java.util.Scanner;

public class BiggestAmoThree {
public static int big(int a,int b,int c)
{
if(a>b&&a>c)
	return a;
else if(b>a&&b>c)
	return b;
else
	return c;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("biigest no is "+big(a,b,c));
	}

}
