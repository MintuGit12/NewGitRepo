package raghusir;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find its a prime no or not");
		int num=sc.nextInt();
			
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				System.out.println("its not a prime number");
		else 
			System.out.println("its a prime number");
			}
		/*for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("its not a prime number");
				break;
			}
			else
			{
				System.out.println("its a prime number");
			}
		}*/
//if(num%1==0 && num)

}
}
