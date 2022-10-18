package raghusir;
import java.util.Scanner;
public class DateFormatEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date in format dd mm yyyy");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		if(dd<1||dd>31||mm<1||mm>12||yy<1)//date month and year format
			System.out.println("invalid");
		else if((mm==4||mm==6||mm==9||mm==11) && dd>30)//days format
      System.out.println("invalid");
		else if((yy%4==0&&yy%100!=0||yy%400==0)&&dd>29&mm==2)//leap year format
			System.out.println("invalid");
		else 
			System.out.println("its a propear date formet");
	}

}
