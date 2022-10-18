package arraysLogic;

import java.util.LinkedHashSet;

public class MainPractice {
public static void printDuplicate()
{
	char[] ch= {'a','a','c','d','r','c','f','d'};
	char[] ch1=ch;
	boolean[] b=new boolean[ch.length];
	for(int i=0;i<ch.length-1;i++)
	{
		int count=1;
		for(int j=i+1;j<ch.length;j++)
		{
		if(b[i]==false)
		{
			if(ch[i]==ch[j])
			{
				count++;
				b[j]=false;
			}
		}
	}
		if(count>1)
		System.out.println(ch[i]+".........>>>>>>"+count);
	}
}
public static void printDuplicateLHS()
{
 
    String str="ms is my fav dhoni dhoni dhoni is my fav";
    String[] s1=str.split(" ");
    LinkedHashSet<String> set=new LinkedHashSet<String>();
for(String s:s1)
{
	set.add(s);
}
for(String ss1:set)
{
int count = 0;
for(String ss2:s1)
{
	if(ss1.equals(ss2))
		count++;
}
if(count>1)
System.out.println(ss1+"......>>>"+count);
}

}
	public static void main(String[] args) {
		
		printDuplicate();
		printDuplicateLHS();
	}

}
