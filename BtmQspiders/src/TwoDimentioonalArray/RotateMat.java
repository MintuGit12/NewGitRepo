package TwoDimentioonalArray;

import java.util.Scanner;

public class RotateMat {
	public void dispMat(int[][] mat)
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
	public int[][] readMat(int[][] mat)
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
	public int[][] leftRot(int[][] mat)
	{
		int[][] left=new int[mat[0].length][mat.length];
		for(int i=0;i<left.length;i++)
		{
			for(int j=0;j<left[i].length;j++)
			{
				left[i][j]=mat[mat.length-1-i][j];
			}
		}
		return left;
	}
	public static void main(String[] args) {
		RotateMat rm=new RotateMat();
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the rows and column :");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int[][] mat=new int[r][c];
	    System.out.println("enter the total "+r*c+" elements");
	    mat=rm.readMat(mat);
	    System.out.println("user entered matrix is :");
	    rm.dispMat(mat);
	    System.out.println("left rotate of matrix is :");
	    int[][] left=rm.leftRot(mat);

	}

}
