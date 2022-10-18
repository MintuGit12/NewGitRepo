package raghusir;
import java.util.Scanner;
public class EvenOddNoMod {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("eneter a no to find it is even or odd");
    int x= s.nextInt();
    float f=x;
    int a=x/2;
    System.out.println(a);
    float b=f/2;
    System.out.println(b);
    if(a==b)
    	
    	System.out.println("its an even number");
    else 
    	System.out.println("its an odd number");
	}

}
