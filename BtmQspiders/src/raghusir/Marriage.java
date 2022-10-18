package raghusir;

import java.util.Scanner;

public class Marriage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find status");
		int num=sc.nextInt();
		/*if(num%3==0 && num%5!=0)
			System.out.println("sanju");
		else if(num%5==0 && num%3!=0)
			System.out.println("geeta");
		else if(num%3==0&&num%5==0)
			System.out.println("sanju weds geeta");
		else 
		System.out.println("invalid");*/
		if(num%3==0&&num%5==0)
			System.out.println("sanju weds geeta");
		else if(num%5==0)
			System.out.println("geeta");
		else if(num%3==0)
			System.out.println("sanju");
	}

}
