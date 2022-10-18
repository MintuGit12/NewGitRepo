package part3java;
import java.util.Scanner;
public class ScannerArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the row size");
		int row=s.nextInt();
		System.out.println("enter the col size");
		int col=s.nextInt();
		int[][] x=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j%2==0)
				{
				x[i][j]=j*4;
				}
				else
				{
					x[i][j]=j*18;
				}
			}
		}
		System.out.println(x.length);
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
			System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(".......................");
		System.out.println("enter the row size");
		int r=s.nextInt();
		System.out.println("enter the column size");
		int c=s.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("filling the value according to coumn");
		for(int i=0;i<r;i++)
		{
			System.out.println("1st loop ran");
			for(int j=0;j<c;j++)
			{
				arr[r][c]=s.nextInt();
			}
		}
		System.out.println("now printing the entered value");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			System.out.println(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
}
