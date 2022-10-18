package raghusir;

import java.util.Scanner;

public class PerfactNo {
public static boolean perfact(int num)
{
	int j=0;
	/*for(int i=1;i<=num/2+1;i++)
	{
	if(num%i==0)
		j+=i;
	}*/
	int i=num;
	i=i/2;
	while(i!=0)
	{
		if(num%i==0)
		j+=i;
			i--;
	}
	if(j==num)
		return true;
	else
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		boolean b=perfact(num);
		if(b==true)
			System.out.println("perfact number");
		else
			System.out.println("not a perfact num");
	}

}
