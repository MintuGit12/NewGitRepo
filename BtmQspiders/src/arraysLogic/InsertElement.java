package arraysLogic;

import java.util.Scanner;

public class InsertElement {
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
public static int[] insertEle(int[] arr,int num,int ind)
{
	arr=initialize(arr);
if(ind<0||ind>arr.length)
{
	System.out.println("invalid index recognised");
	return arr;
}
int[] y=new int[arr.length+1];
y[ind]=num;
System.out.println("here we reached");
for(int i=0;i<arr.length;i++)
{
	if(y[i]<ind)
	{
		y[i]=arr[i];
	}
	else
		y[i+1]=arr[i];
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
public static int[] delEle(int[] arr,int ind)
{
	if(ind<0||ind>arr.length)
	{
		System.out.println("invalid array index :");
		return arr;
	}
	int[] y=new int[arr.length-1];
	for(int i=0;i<y.length;i++)
	{
		if(i<ind)
		{
			y[i]=arr[i];
		}
		else
			y[i]=arr[i+1];
	}
	return y;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of didgit you want to enter in an array");
		int num=sc.nextInt();
		int[] arr=new int[num];
		arr=insertEle(arr,32,3);
		printArr(arr);
		System.out.println("program to delete the element :");
		arr=delEle(arr,2);
		printArr(arr);
	}

}
