package self;

public class PracticeMain1 {
public static void pattern1()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1||i==5||j==1||j==5||i==j||i+j==6)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}

public static void pattern2()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==1||j==5||i==3)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}
public static void patternG()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1||i==5||j==1||i>2&&j==5||i==3&&j>2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}
public static void patternR(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||j==1||i==n/2+1||i==j&&i>n/2+1||j==5&&i<n/2+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}
public static void patternM(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||j==n||j==i&&i<=n/2+1||j+i==n+1&&i<=n/2+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}
public static void patternC(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1&&i>1&&i<n||i==1&&j>1||i==n&&j>1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}public static void patternG2(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||i==1&&j<=n/2+1||i==n&&j<=n/2+1||j==n/2+1&&i>n/2||i>n/2&&j==n/2+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}
	public static void main(String[] args) {
		pattern1();
		pattern2();
		patternG();
		patternR(5);
		patternM(5);
		patternC(5);
		patternG2(5);
	}

}
