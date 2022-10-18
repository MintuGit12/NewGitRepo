package stringLogic;

import java.util.Scanner;

public class ReverseWords {
public static void reverseWord(String st)
{
	char[] ch=st.toCharArray();
	String s="";int a=0;
	for(int i=0;i<ch.length;i++)
	{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			a=i;
		if(i<ch.length-1 && ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		{
			for(int j=i;j>=a;j--)
				s=s+ch[j];
		}
	}
	System.out.println(s);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String :");
		String st=sc.nextLine();
		//st=' '+st;
		reverseWord(st);

	}

}
