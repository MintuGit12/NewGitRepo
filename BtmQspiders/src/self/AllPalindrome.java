package self;

public class AllPalindrome 
{
public static void noPalindrome()
{int num=121;
	int num1=num;
	int x=0;
	while(num!=0)
{	
		x=x*10;
	x=x+num%10;
	num=num/10;
}
System.out.println(x);
if(num1==x)
System.out.println("palindrome");
else
	System.out.println("not palindrome");
}
public static void stringPalindrome()
{
	String s="keep";
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
	}
	if(s1.equals(s))
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
}
	public static void main(String[] args) {
		noPalindrome();
		stringPalindrome();
		factorial();
		reverseOnPosition();
	}
	public static void factorial()
	{
		int x=10;
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				System.out.print(i+" ");
		}
	}
	public static void reverseOnPosition()
	{
		String rev="";
		String s1="my name is ms dhoni";
		String[] str=s1.split(" ");
		for(String s:str)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			rev=rev+" ";
		}
		for(int i=0;i<rev.length();i++)
			System.out.print(rev.charAt(i));
	}

}
