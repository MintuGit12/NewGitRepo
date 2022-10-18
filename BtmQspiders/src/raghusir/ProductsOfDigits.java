package raghusir;
import java.util.Scanner;
public class ProductsOfDigits {
public static int prod(int num)
{
	int pro=1;
	while(num!=0)
	{
		pro*=num%10;
		num=num/10;
	}
	return pro;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("product of all the digit:"+prod(num));

	}

}
