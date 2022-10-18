package arraysLogic;

import java.util.Scanner;

public class ArraySum {
public static int arrSum(int []arr)
{
	initialize(arr);
return arr[0]+arr[arr.length-1];
}
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
public static int sumAll(int []arr)
{
	int sum=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum+=arr[i];
	}
	return sum;
}
public static int diffArray(int []arr)
{
	return arr[0]-arr[1];
}
public static int prodArray(int []arr)
{
	int prod=1;
	for(int i=0;i<=arr.length-1;i++)
	{
		prod*=arr[i];
	}
	return prod;
}
public static int biggestArrayElement(int []arr)
{
	int big=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]>big)
		{
			big=arr[i];
		}
	}
	return big;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of didgit you want to enter");
		int a=sc.nextInt();
		int[] arr=new int[a];
		int sum=arrSum(arr);
System.out.println("sum of digits is :"+sum);
System.out.println("sum of all elements :"+sumAll(arr));
System.out.println("difference between 1st and last element :"+diffArray(arr));
System.out.println("product of array elements :"+prodArray(arr));
System.out.println("biggest array element :"+biggestArrayElement(arr));

	}

}
