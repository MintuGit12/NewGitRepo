package part3java;

public class StringClass 
{
	String d;
public String toString()
{
	return d;
}
StringClass(String s)
{
	this.d=s;
}
	public static void main(String[] args) {
		StringClass obj=new StringClass("this is overridden");
		System.out.println(obj);
		String s="India";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(1));
		String ss=" ";
		
		for(int i=0;i<s.length();i++)
		{
			ss=ss+s.charAt(i);
		}
		System.out.println(ss);
		if(ss==s)
		{
			System.out.println("sharing same string pool adderss");
		}
		else
		{
			System.out.println("not sharing same string pool address");
		}
		System.out.println(s.indexOf('a'));
		String ss1="ram";
		String ss2="ram";
		System.out.println(ss1==ss2);
		System.out.println(s.substring(0, 5));
	}

}
