package raghusir;
import java.util.Scanner;
public class PositivePrintNo {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any positive or negitive no");
	int x=s.nextInt();
	if(x>=0)
	{
		System.out.println("your entered no "+x+" is positive");
	}
	else
	{
		System.out.println("your entered no "+x+" is negitive");
	}
	}

}
