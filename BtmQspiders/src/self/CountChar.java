package self;
import java.util.Scanner;
public class CountChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		int count=0;
		int ct=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='r')
			{
				count++;
			}
			if(c=='a')
			{
				ct++;
			}
		}
		System.out.println("no of occurence is of r:"+count);
		System.out.println("no of occurence is of a:"+ct);
	}

}
