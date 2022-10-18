package raghusir;
import java.util.Scanner;
public class SmallestInt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("enter four integer numbers");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
if(a>b&&a>c&&a>d)
{
	System.out.println("1st no is the greatest no");
}
else if(b>a&&b>c&&b>d)
{
	System.out.println("2nd no is the greatest no");
}
if(c>a&&c>b&&c>d)
{
	System.out.println("3rd no is the greatest no");
}
if(d>a&&d>b&&d>c)
{
	System.out.println("4th no is the greatest no");
}
	}

}
