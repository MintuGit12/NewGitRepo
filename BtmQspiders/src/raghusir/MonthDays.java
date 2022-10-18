package raghusir;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a month number");
		int mm=sc.nextInt();
		if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10)
			System.out.println("31 day in the month");
		else if(mm==2)
			System.out.println("28 day in month");
		else 
			System.out.println("30 day");
	}

}
