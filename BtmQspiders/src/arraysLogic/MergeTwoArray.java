package arraysLogic;

import java.util.Scanner;
public class MergeTwoArray {
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
	System.out.println(" no in array is :");
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
}
public static int[] mergeArr(int[] arr,int[] arr1)
{
	int arr2[]=initialize( arr);
	int arr3[]=initialize( arr1);
	printArr(arr2);
	printArr(arr3);
	int[] arr4=new int[arr2.length+arr3.length];
	System.out.println("printed till here");

		for(int j=0;j<arr2.length;j++)
		{
			arr4[j]=arr2[j];
		}
		int x=0;
		for(int i=arr2.length;i<arr4.length;i++)
		{
			arr4[i]=arr3[x];
			x++;
		}
		System.out.println("merged array is :");
		return arr4;
}
public static int[] negitivePositive(int[] arr5)
{
	int pos=0,neg=0;
	for(int i=0;i<arr5.length;i++)
	{
		if(arr5[i]>=0)
			pos++;
		else
			neg++;
	}
	int[] x= {neg,pos};
	return x;
}
public static int sumEAndO(int[] arr5)
{
	int even=0,odd=0;
	for(int i=0;i<arr5.length;i++)
	{
		if(arr5[i]%2==0)
			even+=arr5[i];
		else
			odd+=arr5[i];
	}
	return even+odd;
}
public static int primeNo(int[] arr5)
{
	int prime=0;
	for(int i=0;i<arr5.length;i++)
	{
	if(isPrime(arr5[i])==true)
	prime++;	
	}
	return prime;
}
	public static boolean isPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1st and 2nd  array");
		int num=sc.nextInt();
		int[] arr=new int[num];
		int num1=sc.nextInt();
		int[] arr1=new int[num1];
		int[] arr5=mergeArr(arr,arr1);
		printArr(arr5);
		int[] arr6=negitivePositive(arr5);
		System.out.println("negitive and posite no is");
		printArr(arr6);
		System.out.println("sum of the even and odd is :"+sumEAndO(arr5));
		System.out.println("prime no in the array is :"+primeNo(arr5));
	}

}
