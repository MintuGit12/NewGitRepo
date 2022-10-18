package raghusir;
import java.util.Scanner;
public class StudentResult {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter four subject marks");
		int p=s.nextInt();
		int c=s.nextInt();
		int m=s.nextInt();
		int b=s.nextInt();
		int total=p+c+m+b;
		float per=total/400*100;
		if(p<35||c<35||m<35||b<35)
		System.out.println("student is failed");
		else
		{
			double d=(p+c+m+b)/4.0;
			if(d>=35)
				System.out.println("passed");
			else if(d>=50)
				System.out.println("semcond class passed");
			else if()
		}
	}

}
