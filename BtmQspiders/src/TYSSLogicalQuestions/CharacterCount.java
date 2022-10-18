package TYSSLogicalQuestions;

import java.util.LinkedHashSet;

public class CharacterCount {

	public static void main(String[] args) {
		String s="Tests";
		s=s.toLowerCase();
LinkedHashSet<Character> lh=new LinkedHashSet<>();
for(int i=0;i<s.length();i++)
{
	lh.add(s.charAt(i));
}
for(Character ch:lh)
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(ch.equals(s.charAt(i)))
			count++;
	}
	System.out.println(ch+" occurence is :"+count);
}
	}

}
