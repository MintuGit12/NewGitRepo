package raghusir;
import java.util.Scanner;
public class TwoDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=-9&&num<10)
		{
			System.out.println("its is a single digit number");
		}
		else if(num>9&&num<100)
		{
			System.out.println("its a two digit +ve no");
		}
		else if(num<=-10&&num>-100)
		{
			System.out.println("number is 2digit -ve no");
		}
		else
		{
			System.out.println("its nither a digit nor a two digit number ");
		}
	}

}
