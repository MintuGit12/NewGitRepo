package raghusir;

import java.util.Scanner;

public class PrimeNo {
public static boolean prime(int no)
{
	for(int i=2;i<=no/2;i++)
	{
		if(no%i==0)
			 return false;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int no=sc.nextInt();
		if(prime(no)==true)
		System.out.println("its a prime no");
		else 
			System.out.println("its not a prime no");

	}

}
