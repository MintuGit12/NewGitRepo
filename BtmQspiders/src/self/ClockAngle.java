package self;

import java.util.Scanner;

public class ClockAngle {
public static float angleBetween(int hh,int mm)
{
	float dig=0;
	float hr=(hh*30)+(mm/5)*(2.5f);
	float min=mm*6;
	//System.out.println(min-hr);
	if(min-hr>0)
	{
		dig=min-hr;
		if(dig>180)
			return 360-dig;
		else
		return dig;
	}
	else {
		dig=-(min-hr);
		if(dig>180)
			return 360-dig;
		else
		return dig;
	}
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time in hour and minute :");
		int hh=sc.nextInt();
		int mm=sc.nextInt();
		float angle=angleBetween(hh,mm);
		System.out.println("angle between min and hour is :"+angle);
	}

}
