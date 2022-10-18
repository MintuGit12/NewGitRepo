package raghusir;
import java.util.Scanner;
public class DateFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date in format dd");
		int dd=sc.nextInt();
		System.out.println("enter the month in format mm");
		int mm=sc.nextInt();
		System.out.println("enter the year int the format yyyyy");
		int yyyy=sc.nextInt();
		if((dd>0&&dd<30)&&(mm==2)&&(yyyy>0))
		System.out.println("invalid date format");
		else if((dd>0&&dd<31)&&(mm>0&&mm<12)&&(yyyy>0))
			System.out.println(dd+"-"+mm+"-"+yyyy);
		else 
			System.out.println("invalid value entered");
	}
}
