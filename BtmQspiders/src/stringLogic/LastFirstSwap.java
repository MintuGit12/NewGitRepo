package stringLogic;

import java.util.Scanner;

public class LastFirstSwap {
public static void lastFirstSwap(String st)
{
	char[] ch=st.toCharArray();
	int f=0;
	for(int i=0;i<ch.length;i++)
	{
		
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			f=i;
		if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		{
		char t=ch[i];
		ch[i]=ch[f];
		ch[f]=t;
		}
		
	}
	st=new String(ch);
	System.out.println(st);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String :");
		String st=sc.nextLine();
		//st=' '+st;
		lastFirstSwap(st);

	}

}
