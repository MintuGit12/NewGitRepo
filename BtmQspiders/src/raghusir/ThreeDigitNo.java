package raghusir;
import java.util.Scanner;
public class ThreeDigitNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("ENTER AN INTEGER NUMBER");
      int num=sc.nextInt();
      if(num>=100&&num<=999)
    	  System.out.println("it is a three digit number");
      else
    	  System.out.println("entered number is not a three digit number");
	}

}
