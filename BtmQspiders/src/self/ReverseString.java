package self;

public class ReverseString {

	public static void main(String[] args) {
		//System.out.println("hiiii");
		String s="RAHUL";
		int a=s.length();
		String rev=" ";
		for(int i=a-1;i>=0;i--)
		{
			//System.out.println("running");
			rev=rev+s.charAt(i);
			//System.out.println(rev);
		}
System.out.println(rev);
	}

}
