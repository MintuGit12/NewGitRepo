package stringLogic;

import java.util.Scanner;

public class AnagramPenagram1 {
public static String[] removalSpace(char[] ch1,char[] ch2)
{
	String s1="";
	String s2="";
//	char[] cha1=new char[ch1.length];
	//char[] cha2=new char[ch2.length];
for(int i=0;i<ch1.length;i++)
{
	if(ch1[i]==' ')
	{
		continue;
	}
	else
	{
		s1=s1+ch1[i];
	}
}
for(int i=0;i<ch2.length;i++)
{
	if(ch2[i]==' ')
	{
		continue;
	}
	else
	{
		s2=s2+ch2[i];
	}
}
System.out.println(s1+"........"+s2);
String[] s= {s1,s2};
return s;
}
public static char[][] lowerCase(String s1,String s2)
{
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	for(int i=0;i<c1.length;i++)
	{
		if(c1[i]>='A'&&c1[i]<='Z')
		{
			char c=c1[i];
			c1[i]=(char)(c+32);
		}
		if(c2[i]>='A'&&c2[i]<='Z')
		{
			char c=c2[i];
			c2[i]=(char)(c+32);
		}
	}
	for(int i=0;i<c1.length;i++)
	{
		System.out.println(c1[i]+">>>>>>>>>>>>>>>>"+c2[i]);
	}
	char[][] c= {c1,c2};
	return c;
}
public static char[][] sortChar(char[] c1,char[] c2)
{
	char c=' ';
	char cc=' ';
for(int i=0;i<c1.length;i++)
{
	for(int j=0;j<c1.length-1;j++)
	{
	if(c1[i]>c1[j+1])
	{
		c=c1[i];
		c1[i]=c1[j+1];
		c1[j+1]=c;
	}
	if(c2[i]>c2[j+1])
	{
		cc=c2[i];
		c2[i]=c2[j+1];
		c2[j+1]=cc;
	}
}
}
for(int i=0;i<c1.length;i++)
System.out.println(c1[i]+".....>>>>>>>"+c2[i]);
char[][] ch= {c1,c2};
return ch;
}
public static boolean compChar(char[] c1,char[] c2)
{
	for(int i=0;i<c1.length;i++)
	{
		if(c1[i]!=c2[i])
			return false;
	}
	return true;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two words :");
	String s1=sc.nextLine();
	char[] ch1=s1.toCharArray();
	String s2=sc.nextLine();
	char[] ch2=s2.toCharArray();
	String[] ss=removalSpace(ch1,ch2);
	if(ss[0].length()==ss[1].length())
	{
	char[][] cc=lowerCase(ss[0],ss[1]);	
	char[][] cc1=sortChar(cc[0],cc[1]);
	if(compChar(cc1[0],cc1[1])==true)
		System.out.println("anagram ");
	else
		System.out.println("not anagram");
	}
	else 
		System.out.println("not anagram");
	}

}
