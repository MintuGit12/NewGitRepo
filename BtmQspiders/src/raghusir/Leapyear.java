package raghusir;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int yy=sc.nextInt();
		/*if(yy%4==0&&yy%100!=0||yy%400==0)
			System.out.println("its a leap year");
		else
		System.out.println("its not a leap year");*/
		if(yy%4==0&&yy%100!=0)
			System.out.println("its a leap year");
		else if(yy%400==0)
			System.out.println("its a leap year");
		else
		System.out.println("ITS NOT A LEAP YEAR");
}
}
