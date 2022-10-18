package arraysLogic;

import java.util.Scanner;

public class PrintFrequency {
	public static int[] initialize(int[] arr)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
public static void frequency(int[] arr)
{
	boolean[] brr=new boolean[arr.length];
	arr=initialize(arr);
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		if(brr[i]==false)
		{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
				count++;
			brr[j]=true;
		}
		}
		System.out.println(arr[i]+"--->"+count);
	}
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of digits you want to enter");
		int num=sc.nextInt();
		int[] arr=new int[num];
		frequency(arr);
	}

}
