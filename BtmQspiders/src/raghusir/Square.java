package raghusir;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of one side of squre");
		float side=s.nextFloat();
		System.out.println("area of the square is :"+side*side);
		System.out.println("perimeter of the square is :"+(4*side));
	}

}
