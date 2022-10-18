package stringLogic;

import java.util.Scanner;

public class Practice1 {
public static int[] countCapSmall(String str)
{
	int cap=0,sm=0,sp=0,dig=0;
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
			cap++;
		else if(ch[i]>='a'&&ch[i]<='z')
			sm++;
		else if(ch[i]==' ')
			sp++;
		else if(ch[i]>='0'&&ch[i]<='9')
			dig++;
	}
	int[] ar= {cap,sm,sp,dig};
	return ar;
}
public static int[] vowConso(String str)
{
	int vow=0,con=0,dg=0;
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u')
			vow++;
		else if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z')
			con++;
		else if(ch[i]>='0'&&ch[i]<='9')
			dg++;
	}
	int[] ar= {vow,con,dg};
	return ar;
}
public static int speChar(String str)
{
	int sp=0;
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z'||ch[i]>='0'&&ch[i]<='9'||ch[i]==' ')
		{
			continue;
		}
		else
		{
			sp++;
		}
	} 
	return sp;
}
public static String capToSmall(String str)
{
	String s="";
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
		{
			s=s+(char)(ch[i]+32);
		}
		else
			s=s+ch[i];
	}
	return s;
}
public static boolean isPalindrome(String s)//malayalam
{
	String str="";
	int j=s.length()-1;
	for(int i=0;i<s.length()/2;i++)
	{
		if(s.charAt(i)!=s.charAt(j))
			return false;
		j--;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence :");
	String st=sc.nextLine();
/*	System.out.println(st.length());
	System.out.println(st.charAt(5));
	System.out.println(st.indexOf('a'));
	System.out.println(st.lastIndexOf('a'));*/
	//int[] ar=countCapSmall(st);
	//System.out.println("capital is :"+ar[0]+" small is :"+ar[1]+" space is :"+ar[2]+" digits present :"+ar[3]);
	//int[] ar=vowConso(st);
	//System.out.println("vowels are :"+ar[0]+" consonents are :"+ar[1]+" digits are :"+ar[2]);
	//System.out.println("Special charcters are :"+speChar(st));
	if(isPalindrome(st)==true)
	{
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
	System.out.println("Capital to small converted :"+capToSmall(st));
	}
	
}
