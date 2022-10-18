package ExamQstn;

public class PracticeMain {
public static void middleEle(String s)
{
	char[] ch=s.toCharArray();
			if(ch.length%2==0)
				System.out.println(ch[ch.length/2-1]+" "+ch[ch.length/2]);
			else
				System.out.println(ch[ch.length/2]);
}
public static void sumOfOddEle(char[] ch)
{
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]%2!=0)
			sum+=ch[i]-48;
	}
	System.out.println(sum);
}
public static void initCap(String s)
{
	String ss=" "+s;
	System.out.println(ss);
	char[] ch=ss.toCharArray();
	
	for(int i=1;i<ch.length;i++)
	{
		if(ch[i-1]==' ')
		{
			ch[i]=(char)(ch[i]-32);
		}
	}
	String s1=new String(ch);
	System.out.println(s1);
}
public static void reverseLetter()
{
	String s1="you are a good boy";
	String[] ss=s1.split(" ");
	for(int i=0;i<ss.length;i++)
	{
		String s=ss[i];
		char[] c=s.toCharArray();
		for(int j=c.length-1;j>=0;j--)
			System.out.print(c[j]);
		System.out.print(" ");
	}
	System.out.println();
}
public static void reverseStringLetter()
{
	String s1="you are a good boy";
	char[] ch=s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		int k=i;
		while(ch[i]!=' '&&i<ch.length)
		{
			i++;
		}
		int j=i-1;
		for(int a=j;a>=k;a--)
		{
			System.out.print(ch[a]);
		}
		System.out.print(" ");
	}
}
public static void palindrome()
{
	String ss="";
	String s="madam";
	for(int i=s.length()-1;i>=0;i--)
	{
		ss=ss+s.charAt(i);
	}
	System.out.println(ss);
	if(ss.equals(s))
		System.out.println("paindrome");
	else
		System.out.println("not palindrome");
}
public static void wordChange()
{
	
	String s="Rama is a good boy";//rama good a is boy
	String[] st=s.split(" ");
	String[] str=new String[st.length];
	for(int i=0;i<st.length;i++)
	{
		if(i%2!=0)
		{
		String ss=st[i];
		}
		
			
	}
}
	public static void main(String[] args) {
		String s="panchaya";
		middleEle(s);
		char[] c= {'9','8','7','3','7','1'};
		sumOfOddEle(c);
		String s1="ram is a good boy";
		initCap(s1);
		reverseLetter();
		//reverseStringLetter();
		palindrome();
	}

}
