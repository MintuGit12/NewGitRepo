package stringLogic;

import java.util.Scanner;

public class UpperLowerString {
public static void upperCase(String s)
{
	String ss="";
	for(int i=0;i<s.length();i++)
	{
	char ch=s.charAt(i);
	if(ch>='a'&&ch<='z')
	{
		ch=(char)(ch-32);
		ss=ss+ch;
	}
		else if(ch>='A'&&ch<='Z')
		{
			ch=(char)(ch+32);
			ss=ss+ch;
		}
		else
			ss=ss+ch;
	}
	System.out.println(ss);
}
public static boolean panagram(String s)//if it contains every word of alphabet
{
	char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
		if(ch[i]>="A"&&ch[i]<="Z"||ch[i]>="a"&&ch[i]<="z")
			continue;
		else
			return false;
	}
}
return true;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the paragraph :");
		String s=sc.nextLine();
		upperCase(s);
		if(panagram(s)==true)
			System.out.println("its a panagram line");
		else
			System.out.println("its not a panagram line");
	}

}
