package rNageshwar;

public class ArrayObj {

	public static void main(String[] args) {
		ArrayObj []arr=new ArrayObj[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=new ArrayObj();
		}
		for(int i=0;i<10;i++)
		{
	System.out.println(arr[i]);
		}
		for(int i=0;i<10;i++)
		{
			arr[i]=new ArrayObj();
		}
		
	}

}
