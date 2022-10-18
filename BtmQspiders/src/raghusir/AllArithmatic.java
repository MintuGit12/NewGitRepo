package raghusir;
import java.util.Scanner;
 abstract class AllArithmatic {
//abstract public static void m1();
	public static void main(String[] args) {
		//double x=100/0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first number");
	System.out.println("enter the second number");
	int y=s.nextInt();
	int a=x+y;
	System.out.println("addition of the entered two number is :"+a);
	int b=x-y;
	System.out.println("substraction of the entered two number is :"+b);
	int c=x/y;
	System.out.println("division of the entered two number is :"+c);
	int d=x*y;
	System.out.println("multiplication of the entered two number is :"+d);
	int e=x%y;
	System.out.println("modulus of the entered two number is :"+e);
	}

}