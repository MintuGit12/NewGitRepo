package stringLogic;

import java.util.Scanner;

public class PalindromeString {
public static boolean isPalindrome(String s)
{
	//char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(0);
		//char c=cha[0];
		if(c==s.charAt(s.length()-1))
			return true;
	}
	return false;
}
public static boolean toLower(String s)
{
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c>='A'&&c<='Z')
			
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the paragraph :");
		String s=sc.nextLine();
		if(isPalindrome(s)==true)
			System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");
	}

}
