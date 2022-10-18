package exceptionHandling;
import java.util.Scanner;
public class ExHandling {
public static Object sum(int a,int b)
{
	try
	{
		Integer x=a/b;
		return x;
	}
	catch(Exception c)
	{
		return c;
	}
	/*finally
	{
		System.out.println("program is ended");
	}*/
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Object o1=sum(a,b);
		System.out.println("value of div is :"+o1);
		String s=(String)o1;
		System.out.println(s);
		/*int u=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='.')
			{
			u++;
			}
		}
		System.out.println("no of . present in exception is :"+u);*/
	}

}
