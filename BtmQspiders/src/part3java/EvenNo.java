package part3java;

public class EvenNo {

	public static void main(String[] args) {
		int brr[]=new int[5];
		for(int i=0;i<=brr.length-1;i++)
		{
			if(i%2==0)
			{
				brr[i]=i*2;
			}
			else
			{
				brr[i]=i*3;
			}
		}
		for(int i=0;i<=brr.length-1;i++)
		 {
			System.out.println(brr[i]);
		}
for(int j=0;j<=brr.length-1;j++)
{
	if(brr[j]%2==0)
	{
		System.out.println("even");
	}
	else
		{
			System.out.println("odd");
		}
	}
}
	}

