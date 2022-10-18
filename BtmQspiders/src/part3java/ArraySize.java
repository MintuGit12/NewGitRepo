package part3java;

public class ArraySize {

	public static void main(String[] args) {
		int[] x=new int[20];
		for(int i=0;i<=x.length-1;i++)
		{
			x[i]=i;
			for(int j=0;j<=x.length-1;j++)
			{
				System.out.println(x[i]);
			}
		}

	}

}
