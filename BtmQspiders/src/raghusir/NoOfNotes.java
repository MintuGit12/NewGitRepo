
package raghusir;
import java.util.Scanner;
public class NoOfNotes {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the amount you have");
	int rs=s.nextInt();
	switch(rs>0)
	{
			int note=0;
	case 1:System.out.println("no of 2000 notes"+(rs/2000));
			rs=rs%2000;
	case 1:System.out.println("no of 500 notes"+(rs/500));
			rs=rs%500;
	case 1:System.out.println("no of 200 notes"+(rs/200));
			rs=rs%200;
	case 1:System.out.println("no of 100 notes"+(rs/100));
			rs=rs%100;
	case 1:System.out.println("no of 50 notes"+(rs/50));
	rs=rs%50;
	case 1:System.out.println("no of 20 notes"+(rs/20));
	rs=rs%20;
	case 1:System.out.println("no of 2000 notes"+(rs/10));
	rs=rs%10;
	case 1:System.out.println("no of 2000 notes"+(rs/2000));
	case 1:System.out.println("no of 2000 notes"+(rs/2000));
	case 1:System.out.println("no of 2000 notes"+(rs/2000));
	}
	}

}