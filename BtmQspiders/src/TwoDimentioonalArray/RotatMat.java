package TwoDimentioonalArray;

import java.util.Scanner;

public class RotatMat {
	public static int[][] readMat(int[][] mat)
	{
		Scanner sc=new Scanner(System.in);
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			mat[i][j]=sc.nextInt();
		}
	}
	return mat;
	}
	public static void dispMat(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] rot90Left(int[][] mat)
	{
		int[][] l=transpose(mat);
		int[][] ll=rowWiseRev(l);
		return ll;
	}
	public static int[][] rot90Right(int[][] mat)
	{
		mat=transpose(mat);
		mat=colWiseRev(mat);
		return mat;
	}
	public static int[][] transpose(int[][] mat)
	{
		int[][] arr=new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				arr[i][j]=mat[j][i];
			}
		}
		return arr;
	}
	public static int[][] rowWiseRev(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length/2;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j]=temp;
			}
		}
		return mat;
	}
	public static int[][] colWiseRev(int[][] mat)
	{
		for(int i=0;i<mat.length/2;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[mat.length-1-i][j];
				mat[mat.length-1-j][j]=temp;
			}
		}
		return mat;
	}
	public static void main(String[] args) {
		ReadArrayEx ra=new ReadArrayEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of row and column");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] mat=new int[r][c];
		System.out.println("enter "+r*c+" elements");
		mat=readMat(mat);
		System.out.println("user entered matrix is");
		dispMat(mat);
		int[][] left=rot90Left(mat);
		System.out.println("90 degree left rotated matrix is :");
		dispMat(left);
		int[][] right=rot90Left(mat);
		System.out.println("90 degree right rotated matrix is :");
		dispMat(right);
	}

}
