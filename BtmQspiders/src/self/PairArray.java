package self;
import java.util.Scanner;
public class PairArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] x=new int[10];
		System.out.println("initialize the array");
		for(int i=0;i<x.length;i++)
		{
			x[i]=s.nextInt();
		}
System.out.println("array initialization completed");
for(int i:x)
{
	System.out.print(i+"  ");
}
System.out.println(" duplicate value");
int[] y=x;
//int[] z=new int[6];
int b=0;
for(int i=0;i<x.length;i++)
{
for(int j=0;j<y.length;j++)	
{
	
	if(x[i]==y[j])
			{
		int a=x[i];
		b=a;
		
			}


}
System.out.print(b);
}
	}

}
