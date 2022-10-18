//find duplicate in an array
package arraysLogic;

public class Duplicate {

	public static void main(String[] args) {
	int[] x= {10,5,7,10,15,7,8,9,5,3,3,0};
	int [] y=x;
	/*for(int i=0;i<=y.length-1;i++)
	{
		System.out.println(y[i]);
	}*/
	for(int i=0;i<=x.length-1;i++)
	{
		for(int j=i+1;j<=y.length-1;j++)
		{
			if(x[i]==y[j])
			{
				System.out.println(x[i]);
			}
		}
	}
	}

}
