package pattern;
import java.util.Scanner;
public class NoPrintI {
public static void numPrint(int num)
{
	for(int i=num;i>=1;i--)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines you want to print");
		int num=sc.nextInt();
		numPrint(num);

	}

}
