
package raghusir;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the radius of the circle");
	int r=s.nextInt();
	double area=3.14*(r*r);
	System.out.println("Area of the circle is "+area);
	double circum=2*3.14*r;
	System.out.println("circumference of the circle is :"+circum);
	}

}