package TYSSLogicalQuestions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Life";
		String s2="FilE";
		if(s1.length()==s2.length())
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] ch1=s1.toCharArray();
			Arrays.sort(ch1);
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch2);
			String s3=new String(ch1);
			String s4=new String(ch2);
			if(s3.equals(s4))
				System.out.println("anagram");
			else
				System.out.println("not anagram");
		}
		else
			System.out.println("not anagram");
	}

}
