package arraysLogic;

import java.util.Scanner;

public class InsertFromPosition {
	public static int[] initialize(int []arr)
	{
		System.out.println("initialize the array :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int[] enterArray(int[] arr,int ind)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("new array size :");
		int nu=sc.nextInt();
		int[] x=new int[nu];
		x=initialize(x);
		if(ind<0||ind>arr.length)
		{
			System.out.println("index is invalid :");
			return arr;
		}
		int[] y=new int[arr.length+x.length];
		for(int i=0;i<x.length;i++)
		{
			y[ind+i]=x[i];
		
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i<ind)
				y[i]=arr[i];
			else
				y[x.length+i]=arr[i];
		}
		return y;
		}
	public static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of digit you want to enter in an array");
		int num=sc.nextInt();
		int[] arr=new int[num];
		arr=initialize(arr);
		arr=enterArray(arr,3);
		printArr(arr);
	}

}
