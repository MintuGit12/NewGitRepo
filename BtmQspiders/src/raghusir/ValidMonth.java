package raghusir;
import java.util.Scanner;
public class ValidMonth {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a month in number :");
		int mon=s.nextInt();
		if(mon>=1&&mon<=12)
		{
			System.out.println("it is a valid month");
		}
		else 
		{
			System.out.println("it is invalid month typed");
		}
	}

}
