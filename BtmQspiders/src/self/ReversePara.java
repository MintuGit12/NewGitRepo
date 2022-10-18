package self;

public class ReversePara {

	public static void main(String[] args) {
		String s="MY NAME IS MINTU TOMAR";
		String ss="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ss=ss+s.charAt(i);
		}
		System.out.println(ss);

	}
	

}
