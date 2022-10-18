package raghusir;
import java.util.Scanner;
public class MonthName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		String[] mon= {"jan","feb","march","april","may","june","july","august","september","october","november","december"};
		int a=sc.nextInt();
		if(a<1&&a>=13)
			System.out.println("invalid input");
		else
		{
			System.out.println(mon[--a]);
		}
	}

}
