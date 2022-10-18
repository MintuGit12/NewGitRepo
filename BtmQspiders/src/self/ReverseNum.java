package self;
import java.util.*;
public class ReverseNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a 4 digit number yuo want to reverse");
		int x=s.nextInt();
		int rev=0;
		for(int i=0;i<4;i++)
		{
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.println("reverse no is"+rev);
		while(x!=0)
		{
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.println("reverse no is"+rev);
		System.out.println("reverse a number enter a num");
	String num=s.next();
	//System.out.println(String.valueOf(num));
	StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev1=sb.reverse();
	}

}
