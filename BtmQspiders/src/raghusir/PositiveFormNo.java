package raghusir;
import java.util.Scanner;
public class PositiveFormNo {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any positive or negitive no");
	int x=s.nextInt();
	if(x>=0)
	{
		System.out.println("your entered no "+x+" is already in positive form");
	}
	else
	{
		int a=-(x);
		System.out.println("your entered no positive form is :"+a);
	}
	}

}