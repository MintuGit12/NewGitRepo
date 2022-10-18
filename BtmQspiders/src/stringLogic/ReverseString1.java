package stringLogic;

import java.util.Scanner;

public class ReverseString1 {
public static void reverseString(String st)
{
	char[] ch=st.toCharArray();
	int a=0,k=0;
	String[] ss=new String [9];
	for(int i=0;i<ch.length;i++)
	{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			a=i;
		if(i<ch.length-1 && ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		{
			String s="";
			for(int j=a;j<i;j++)
			{
				s=s+ch[j];
				ss[k]=s;
				System.out.print(s);
				k++;
			}
		}
	}
	for(String s:ss)
	{
	System.out.println(s);
}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String :");
		String st=sc.nextLine();
		//st=' '+st;
		reverseString(st);


	}

}
