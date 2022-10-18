package raghusir;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check its a armstrong");
		int num=sc.nextInt();
		int num1=num;
		int num2=num1;
		int x=0;
		while(num1!=0)
		{
		num1=num1/10;
		x++;
		}
		int z=0;
	for(int i=0;i<x;i++)
	{
		for(int j=0;j<x;j++)
		{
			int y=num2%10*num2%10;
			z+=y;
			System.out.println(z);
		}
		num2=num2/10;
		
		//System.out.println(num2);
		
	}
	
		
	}

}
