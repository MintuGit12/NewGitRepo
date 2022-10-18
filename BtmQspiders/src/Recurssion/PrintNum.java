package Recurssion;

import java.util.Scanner;

public class PrintNum {
public static void printNum(int n)//forward tracing
{
	System.out.print(n+" ");
	if(n>1)
		  printNum(n-1);
}
/*public static void printNum(int n)//backward tracing
{
	if(n>1)
		  printNum(n-1);
	System.out.print(n+" ");
}*/
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number upto which you want to print :");
int num=sc.nextInt();
printNum(num);
	}

}
