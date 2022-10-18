package TwoDimentioonalArray;
import java.util.Scanner;
public class ReadArrayEx {
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
public void bigNo(int[][] mat)
{
	int big=mat[0][0];
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			if(big<mat[i][j])
				big=mat[i][j];
		}
	}
	System.out.println("biggest no is :"+big);
}
public void sumElement(int[][] mat)
{
	int sum=0;
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
				sum+=mat[i][j];
		}
	}
	System.out.println("sum of elements is :"+sum);
}
public void primeNonP(int[][] mat)
{
	int pr=0,np=0;
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
				int a=mat[i][j];
				if(prime(a)==true)
					pr++;
				else
					np++;
				
		}
	}
System.out.println("prime no is :"+pr);
System.out.println("non prime no is :"+np);
}
public static boolean prime(int a)
{
	for(int k=2;k<a/2;k++)
	{
		if(a/k==0)
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		ReadArrayEx ra=new ReadArrayEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of row and column");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] mat=new int[r][c];
		System.out.println("enter "+r*c+" elements");
		mat=ra.readMat(mat);
		ra.dispMat(mat);
		ra.bigNo(mat);
		ra.sumElement(mat);
		ra.primeNonP(mat);
	}

}
