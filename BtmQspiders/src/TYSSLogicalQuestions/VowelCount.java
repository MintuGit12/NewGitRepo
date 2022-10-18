package TYSSLogicalQuestions;

public class VowelCount {

	public static void main(String[] args) {
		String s="maHIpal";
		s=s.toLowerCase();
		int vow=0,cons=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				vow++;
			else 
				cons++;
		}
		System.out.println("vowel is :"+vow);
		System.out.println("consonent is :"+cons);
	}

}
