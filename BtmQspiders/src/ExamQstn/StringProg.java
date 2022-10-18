package ExamQstn;

public class StringProg {
public static void revString(String s)
{
	String ss="";
	for(int i=s.length()-1;i>=0;i--)
	{
		ss=ss+s.charAt(i);
	}
	System.out.println(ss);
	System.out.println();
}
public static void revStringByArray(String s)
{
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length/2;i++)
	{
		for(int j=ch.length/2-1;j>=0;j--)
		{
			char chh=ch[j];
			ch[j]=ch[i];
			ch[i]=chh;
		}
	}
	for(int i=0;i<ch.length;i++)
		System.out.print(ch[i]);
	System.out.println();
}
public static void revString1()
{
      String str="player favourite my is dhoni ms";
      String[] s1=str.split(" ");
      for(int i=s1.length-1;i>=0;i--)
      {
    	  System.out.print(s1[i]+" ");
      }
      System.out.println();
    }
public static void sumNoString(String s)
{
char[] c=s.toCharArray();
	int sum=0;
	for(int i=0;i<c.length;i++)
	{
	
		if(c[i]=='0'||c[i]=='1'||c[i]=='2'||c[i]=='3'||c[i]=='4'||c[i]=='5'||c[i]=='6'||c[i]=='7'||c[i]=='8'||c[i]=='9')
		{
		int x=((int)c[i])-48;
		sum+=x;
		}
	}
	System.out.println(sum);
}
public static void stringOccurence(String s)
{
	char[] ch=s.toCharArray();
	boolean[] b=new boolean[ch.length];
	for(int i=0;i<ch.length;i++)
	{
		if(b[i]==false)//my name is kkhhaannn
		{
			char c=ch[i];
			int count=0;
			for(int j=i;j<ch.length;j++)
			{
				if(!(c==' ')&&c==ch[j])
				{
				count++;
				b[j]=true;
				}
			}
			if(count>1)
			System.out.println(ch[i]+"------>>>"+count);
		}
		//System.out.println();
		
	}
}
	public static void main(java.lang.String[] args) {
		String s="My name is khan";
		//revString(s);
		//revStringByArray(s);
		//revString1();
		//sumNoString("My fav45urate palyer23 is9 ms2 dhoni76");
		stringOccurence("my name is kkhhaannn");
	}

}
