package raghusir;

import java.util.Scanner;

public class Palindrome3Dig {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		System.out.println("all 3 dig palindrome");
		for(int i=1;i<=9;i++)
		{
			for(int j=0;j<=9;j++)
			{
				System.out.println(i+""+j+""+i);
			}
		}

	}

}
