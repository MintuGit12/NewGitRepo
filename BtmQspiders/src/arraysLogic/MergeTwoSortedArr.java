package arraysLogic;

import java.util.Scanner;

public class MergeTwoSortedArr {
	public static int[] mergeArr(int[] arr,int[] brr)
	{
		int[] y=new int[arr.length+brr.length];
		int i=0,j=0,k=0;
	while(i<arr.length&&j<brr.length)
	{
		if(arr[i]<brr[j])
			y[k++]=arr[i++];
		else
			y[k++]=brr[j++];
	}
	while(i<arr.length)
		y[k++]=arr[i++];
	while(j<brr.length)
		y[k++]=brr[j++];
		return y;
	}
	public static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static int[] zigZag(int[] arr,int[] brr)
	{
		int[] z=new int[arr.length+brr.length];
		int i=0,j=0,k=0;
		while(j<arr.length&&k<brr.length)
		{
			z[i++]=arr[j++];
			z[i++]=brr[k++];
		}
		while(j<arr.length)
		z[i++]=arr[j++];
		while(k<brr.length)
			z[i++]=brr[k++];
		return z;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("merge two sorted arrays to a single array");
		int[] arr= {11,22,33,44,55,66,77};
		int[] brr= {13,23,45,67,89};
		printArr(mergeArr(arr,brr));
		System.out.println("merge tow array to print zigzag");
		printArr(zigZag(arr,brr));
	}

}
