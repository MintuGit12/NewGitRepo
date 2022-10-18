package raghusir;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		float len=s.nextFloat();
		System.out.println("enter the bredth of the rectangle");
		float bre=s.nextFloat();
		System.out.println("area of the rectangle is :"+len*bre);
		System.out.println("perimeter of the rectangle is :"+2*(len+bre));
	}

}
