package raghusir;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any integer number");
	int x=s.nextInt();
	if(x%2==0)
	{
		System.out.println("your entered no "+x+" is Even");
	}
	else
	{
		System.out.println("your entered no "+x+" is Odd");
	}
	}

}