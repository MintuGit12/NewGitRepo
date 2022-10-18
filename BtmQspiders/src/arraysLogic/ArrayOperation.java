package arraysLogic;
import java.util.Scanner;
public class ArrayOperation {
public static int[] initialize(int[] arr)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("initialize the array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("array got initialized");
	return arr;
}
public static void printArr(int[] arr1)
{
	System.out.println("entered arrays no is :");
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
}
public static int differnceNo(int[] arr)
{
	int arr1[]=initialize(arr);
	printArr(arr1);
	int big=arr1[0];
	int small=arr1[0];
	for(int i=0;i<arr1.length;i++)
	{
		if(arr1[i]>big)
		{
			big=arr1[i];
		}
		else if(arr1[i]<small)
			small=arr1[i];
	}
	return big-small;
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int num=sc.nextInt();
		int[] arr=new int[num];
		//int[] arr1=initialize(arr);
		//printArr(arr1);
		System.out.println("the difference betwee large and small no is "+differnceNo(arr));
	}

}
