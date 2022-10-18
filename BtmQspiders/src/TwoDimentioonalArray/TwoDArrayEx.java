package TwoDimentioonalArray;

public class TwoDArrayEx {

	public static void main(String[] args) {
		int[] w= {12,23,34,4,23,34,2,45,3};
		int[] x= {12,23,34,4};
		int[] y= {12,23,34,4};
		int[] z= {12,23,34,4};
		int[][] a= {{12,23,34,4,23,34,2,45,3},{12,23,34,4},{12,23,34,4},{12,23,34,4}};
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[0][2]);
		System.out.println("..........................");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
