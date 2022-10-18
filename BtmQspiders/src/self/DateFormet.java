package self;

import java.util.Scanner;

public class DateFormet {
public static void dateFormet(int dd,int mm,int yy)
{
	if(dd<1||dd>31||mm<1||mm>12||yy<1)
		System.out.println("invalid");
	
	else if((mm==2||mm==4||mm==6||mm==9||mm==11)&&dd>30)
		System.out.println("invalid");
	else if((yy%4==0&&yy%100!=0||yy%400==0)&&dd>28&&mm==2)
		System.out.println("invalid");
	else if(mm==2&&dd>28)
		System.out.println("invalid");
	else
		System.out.println("valid");
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the date in format dd mm yyyy");
int dd=sc.nextInt();
int mm=sc.nextInt();
int yy=sc.nextInt();
dateFormet(dd,mm,yy);
	}

}
