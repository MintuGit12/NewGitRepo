package part3java;

public class TwoDArray {

	public static void main(String[] args)
	{
	int[][] x= {{10,20,30},{33,34,45},{76,87,89},{90,12,36}};	
	System.out.println("print the 2D array");
	for(int i=0;i<=x.length-1;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			System.out.print(x[i][j]+" ");
			}
		System.out.println();
	}
	}

}
