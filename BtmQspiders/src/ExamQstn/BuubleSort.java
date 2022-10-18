package ExamQstn;

public class BuubleSort {
public static void ascSort(int[] a)
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	printArr(a);
	System.out.println();
}
public static void descSort(int[] a)
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("decending order :");
	printArr(a);
}
public static void maxNo(int[] a)
{
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
			max=a[i];
	}
	System.out.println("max no is"+max);
}
public static void minNo(int[] a)
{	int min =a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
			min=a[i];
	}
	System.out.println("minimum value is :"+min);
}
public static void printArr(int[] a)
{
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		int[] a= {10,5,20,13,60,55,8,0};
		ascSort(a);
		descSort(a);
		maxNo(a);
		minNo(a);
	}

}
