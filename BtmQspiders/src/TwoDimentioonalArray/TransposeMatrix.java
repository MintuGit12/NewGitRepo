package TwoDimentioonalArray;

import java.util.Scanner;

public class TransposeMatrix {
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
	public int[][] transpose(int[][] mat)
	{
		int[][] tran=new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				tran[i][j]=mat[j][i];
			}
		}
		return tran;
	}
	public int[][] reverseRow(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length/2;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[i][mat[0].length-1-j];
				mat[i][mat[0].length-1-j]=temp;
			}
		}
		return mat;
	}
	public int[][] reverseCol(int[][] mat)
	{
		for(int i=0;i<mat.length/2;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[mat.length-1-i][j];
				mat[mat.length-1-i][j]=temp;
			}
		}
		return mat;
	}
	public static void main(String[] args) {
		TransposeMatrix t=new TransposeMatrix();
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows and column :");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][] mat=new int[r][c];
    System.out.println("enter the total "+r*c+" elements");
    mat=t.readMat(mat);
    System.out.println("user entered matrix is :");
    t.dispMat(mat);
    int[][] tran=t.transpose(mat);
    System.out.println("transpose matrix is :");
    t.dispMat(tran);
    int[][] rev=t.reverseRow(tran);
    System.out.println("reverse row of the matrix is :");
    t.dispMat(rev);
    int[][] crev=t.reverseCol(rev);
    System.out.println("reverse column of the matrix is :");
    t.dispMat(crev);
	}

}
