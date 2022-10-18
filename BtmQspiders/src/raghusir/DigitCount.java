package raghusir;
import java.util.Scanner;
public class DigitCount {
public static int digitCount(int num)
{
	int count =0;
	/*while (num!=0)
	{
		count++;
		num=num/10;
	}*/
	do 
	{
	count++;
	num=num/10;
	}while(num!=0);
	return count;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("Count of all the digit:"+digitCount(num));
	}

}
