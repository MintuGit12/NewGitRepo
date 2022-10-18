package raghusir;
import java.util.Scanner;
public class AlaphabetPattern {
public static void alphaPattern(int num)
{
	alphaPattern2(num);
	for(int i=65;i<=65+num-1;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void alphaPattern2(int num)
{
	alphaPattern3(num);
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print((char)(i+64)+" ");
		}
		System.out.println();
	}
	System.out.println();
}
public static void alphaPattern3(int num)
{
	for(int i=0;i<=num;i++)
	{
		for(int j=97;j<=97+num-1;j++)
		{
			System.out.print((char)j+" ");
		}
		System.out.println();
	}
	System.out.println();
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of alpha lines you want to print");
	int num=sc.nextInt();
	alphaPattern(num);
}

}
