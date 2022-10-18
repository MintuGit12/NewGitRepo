package stringLogic;

public class InterviewMain {
public static void swapNo(int x,int y)
{
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println(x+":x value");
System.out.println(y+":y value");
}
public static void printingAlpabet()
{
	for(int i=97;i<123;i++)
	{
		System.out.print((char)i+" ");
	}
	System.out.println();
}
public static void ascOrder()
{
	String s="Raman";
	char[] ch=s.toCharArray();
	ch.
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);
	}
	for(int i=0;i<ch.length-1;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]>ch[j])
			{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
	}
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]);
	}
	System.out.println();
}
public static void swapFirstAndLast()
{
	String st="";
	String s="first";
	for(int i=0;i<s.length();i++)
	{
		if(i==0)
		{
		st=st+s.charAt(s.length()-1);
		}
		else if(i==s.length()-1)
		{
			st=st+s.charAt(0);
		}
		else
		st=st+s.charAt(i);
		
}
		for(int i=0;i<st.length();i++)
		{
		System.out.println(st.charAt(i));	
		}
}
	public static void main(String[] args) {
	
		swapNo(50,110);
		printingAlpabet();
		ascOrder();
		swapFirstAndLast();
	}

}
