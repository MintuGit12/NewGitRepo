package TwoDimentioonalArray;

import java.util.Scanner;

public class BiggestEle {
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
		public static void dispMat2(int[] mat)
		{
			int[] bg=new int[mat.length];
			for(int i=0;i<mat.length;i++)
			{
					System.out.print(mat[i]+" ");
				}
				System.out.println();
			}
		public static int[] rowWiseBig(int[][] mat)
		{
			int big[]=new int[mat.length];
			for(int i=0;i<mat.length;i++)
			{
				big[i]=mat[i][0];
				for(int j=0;j<mat[i].length;j++)
				{
					if(mat[i][j]>big[i])
						big[i]=mat[i][j];
				}
			}
			return big;
		}
		public static int[] colWiseBig(int[][] mat)
		{
			int big[]=new int[mat[0].length];
			for(int i=0;i<mat[0].length;i++)
			{
				big[i]=mat[0][i];
				for(int j=0;j<mat.length;j++)
				{
					if(mat[j][i]>big[i])//it iterate column wise
						big[i]=mat[j][i];
				}
			}
			return big;
		}
		public static int[][] digEleRev(int[][] mat)
		{
			for(int i=0;i<mat.length/2;i++)
			{
				
						int temp=mat[i][i];
						mat[i][i]=mat[mat.length-1-i][mat.length-1-i];
						mat[mat.length-1-i][mat.length-1-i]=temp;
						
						temp=mat[i][mat.length-1-i];
						mat[i][mat.length-1-i]=mat[mat.length-1-i][i];
						mat[mat.length-1-i][i]=temp;
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
		int[] big=rowWiseBig(mat);
		System.out.println("row wise biggest elements are :");
		dispMat2(big);
		int[] bigC=colWiseBig(mat);
		System.out.println("row wise biggest elements are :");
		dispMat2(bigC);
		System.out.println("diagonal wise reverse numbers :");
		dispMat(mat);
		int[][] dig=digEleRev(mat);
		
		dispMat(dig);
	}

}
