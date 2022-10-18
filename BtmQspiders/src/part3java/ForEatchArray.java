package part3java;

public class ForEatchArray 
{
	static float[] f= {19.4f,67.5f,78.5f,98.4f};
	static float f1[][]= {{19.5f,34.6f},{98.4f,67.7f}};
	static void show()
	{
	for(float f2:f1)
	{
		for(float f3:f2)
		{
		System.out.println(f1);
	}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(float f1:f)
		{
			System.out.println(f1);
		}
		for(int i=0;i<=f.length-1;i++)
		{
			System.out.println(f[i]);
		}
		//show();

	}

}
