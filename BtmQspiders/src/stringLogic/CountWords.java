package stringLogic;
import java.util.*;
public class CountWords {
public static void wordsCount(String st)
{
	int wc=0;
	char[] ch=st.toCharArray();
	/*for(int i=0;i<ch.length;i++)
	{
		//if(ch[i]!=' '&&ch[i-1]==' ')
		if(ch[i]==' '&&ch[i+1]!=' ')
			wc++;
	}*/
	for(int i=0;i<ch.length;i++)
	{
		if(i==0 && ch[i]!=' '||cha[i]!=) 
	}
	System.out.println(wc);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence :");
		String st=sc.nextLine();
		st=" "+st;
		wordsCount(st);
	}

}
