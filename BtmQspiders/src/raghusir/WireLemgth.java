package raghusir;
import java.util.Scanner;
public class WireLemgth {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of wire in centimeter");
		float f=s.nextFloat();
		System.out.println("feet size is :"+(f/30.48));
		System.out.println("inches size is :"+(f/2.54));
		System.out.println("meter size :"+(f/100));
	}

}
