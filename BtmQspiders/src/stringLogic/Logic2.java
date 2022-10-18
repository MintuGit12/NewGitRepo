package stringLogic;

public class Logic2 {
public static String sub(String s)
{
	char[] ch=s.toCharArray();
	String s1=""+ch[0];
	for(int i=1;i<ch.length;i++)
	{
		
		for(int j=i+1;j<ch.length;j++)
		{
			if(!(ch[i]==ch[j]))
					{
				s1=s1+ch[i];
					}
			else
				return s1;
		}
		System.out.println(s1);
	}
	return s1;
}
	public static void main(String[] args) {
		String s="Anita";
		String s1=sub(s);
		System.out.println(">>>>>>>>>>>"+s1);
		

	}

}
