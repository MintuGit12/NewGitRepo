package stringLogic;
import java.util.Scanner;
public class TestString {
public static void charIndex(String s)
{
	for(int i=0;i<s.length();i++)
	{
		System.out.println(i+"--->"+s.charAt(i));
	}
}
public static int[] capSmall(String s)
{
	int cap=0,small=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c>='A'&&c<='Z')
			cap++;
		else if(c>='a'&&c<='z')
			small++;
	}
	int[] ar= {cap,small};
	return ar;
}
public static void charArray(String s)
{
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	System.out.println(ch[i]+": character in char array");
	}
}
public static void digitInString(String s)
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='0'&&ch<='9')
			count++;
		
	}
	System.out.println("digits present :"+count);
}
public static void vowelsConsonent(String s)
{
	int vow=0,dig=0,cont=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vow++;
		else if(ch>=0&&ch<=9)
			dig++;
		else
			cont++;
		
	}
	System.out.println("vowel present :"+vow);
	System.out.println("consonent present :"+cont);
}
public static void specialChar(String s)
{int spe=0;
	for(int i=0;i<s.length();i++)
	{
	char ch=s.charAt(i);
	if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*')
		spe++;
	}
	System.out.println("special character present is :"+spe);
}
//to charArray())
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the paragraph :");
		String s=sc.nextLine();
		System.out.println("length of the string is :"+s.length());
		char c=s.charAt(3);
		System.out.println(c);
		//print index and charcter
		charIndex(s);
		//to find index of perticular character
		int i=s.indexOf('q');
		int j=s.lastIndexOf('c');
		System.out.println(i);
		System.out.println(j);
		//to find index of all charcters in string
		int[] k=capSmall(s);
		System.out.println("no of cap letters :"+k[0]);
		System.out.println("no of small letters :"+k[1]);
		//character arrays string
		charArray(s);
		digitInString(s);
		vowelsConsonent(s);
		specialChar(s);
	}

}
