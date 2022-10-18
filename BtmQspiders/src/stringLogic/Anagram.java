package stringLogic;

public class Anagram {
public static void isAnagram()
{
	
}
public static boolean isPalindrome(String s)
{
	
	int j=s.length()-1;

	for(int i=0;i<s.length()/2;i++)
	{
		if(s.charAt(i)!=s.charAt(j))
			return false;
		j--;
	}
	return true;
}
public static void interchangeOddPos(String s)
{
	String[] str=s.split(" ");
	for(int i=0;i<=str.length/2;i++)
	{
		for(int j=str.length-1;j>=0;j--)
		{
			String s1=str[i];
			str[i]=str[j];
			str[j]=s1;
		}
			
	}
	for(String s2:str)
	{
		System.out.print(s2+" ");
	}
	}
	public static void main(String[] args) {
		
		interchangeOddPos("Rama is going to forest with laxmana and seeta");//rama to going is forest 
		//and laxmana and seeta
		System.out.println(isPalindrome("mumumm"));
	}

}
