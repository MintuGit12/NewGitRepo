package raghusir;

import java.util.Scanner;

public class ValidOrInvalidDate {
public static boolean dateFormat(int dd,int mm,int yy)
{
	if(dd<01||dd>31||mm<1||mm>12||yy<1)
		return false;
	else if(mm==02&&dd>29)
		return false;
	else if((mm==4||mm==6||mm==9||mm==11)&&dd>30)
		return false;
	else if(!(yy%4==0&&yy%100==0||yy%100==0)&&mm==2&&dd>28)
		return false;
	else 
		return true;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date in the formet dd mm yy");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		if(dateFormat(dd,mm, yy)==true)
			System.out.println("you have entered a valid date :"+dd+"-"+mm+"-"+yy);
		else
			System.out.println("your entered date format :"+dd+"-"+mm+"-"+yy+" is invalid");

	}

}
