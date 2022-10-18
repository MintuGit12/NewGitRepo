package arraysLogic;

import java.util.Scanner;

public class ArrayOp1 {
	public static int[] initialize(int []arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("initialize the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int[] evenOdd(int[] arr)
	{
		int even=0,odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
				System.out.println("even no are "+arr[i]);
			}
			else
			{
				odd++;
				System.out.println("odd no are "+arr[i]);
			}
		}
		int[] brr= {even,odd};
		return brr;
	}
	public static int avggArr(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];
		}
		return sum/arr.length;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of didgit you want to enter");
		int a=sc.nextInt();
		int[] arr=new int[a];
		initialize(arr);
		int[] brr=evenOdd(arr);
		System.out.println("no of even is :"+brr[0]+" no of odd are :"+brr[1]);
		System.out.println("avarage of array element :"+avggArr(arr));
	}

}
