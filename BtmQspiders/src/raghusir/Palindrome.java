package raghusir;
import java.util.*;
public class Palindrome {
public static int pali(int num)
{
	int x=0;
	while(num!=0)
	{
		x=x*10+num%10;
		num=num/10;
	}
	return x;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		if(pali(num)==num)
			System.out.println("no is palindrome");
		else
			System.out.println("no is not palindrome");
	}

}
