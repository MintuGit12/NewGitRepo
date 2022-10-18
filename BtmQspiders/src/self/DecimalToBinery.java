package self;

import java.util.Scanner;

public class DecimalToBinery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		String y="";
		while(x!=0)//392
		{
			if(x%2==0)
			{
				y=y+0;
				//System.out.print(x%2);
			}
			else
			{
			y=y+1;
			//System.out.print(x%2);
			}
			x=x/2;
		}
		System.out.println();
		System.out.println(y);
		char[] ch=y.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
		System.out.print(ch[i]);
		}

	}

}
