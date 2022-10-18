package raghusir;
import java.util.Scanner;
public class IntegerMiddleVal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three no to find second biggest no");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int big=0;
		if (n1>n2&&n1>n3)
		{
			big=n1;
			if(n2>n3)
				System.out.println("2nd biggest number is"+n2);
			else
				System.out.println("2nd biggest number is"+n3);
		}
		else if(n2>=n1&&n2>=n3)
		{
			big=n2;
			if(n1>n3)
				System.out.println("2nd biggest number is"+n1);
			else
				System.out.println("2nd biggest number is"+n3);
		}
		else if(n3>n1&&n3>n2)
		{
			big=n3;
			if(n1>n2)
				System.out.println("2nd biggest number is"+n1);
			else
				System.out.println("2nd biggest number is"+n2);
		}
	}

}
