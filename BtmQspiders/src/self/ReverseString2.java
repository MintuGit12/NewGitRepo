package self;

public class ReverseString2 {

	public static void main(String[] args) {
		//System.out.println("reversing the string");
		String s="I AM INDIAN BY NATIONALITY";
		String ss=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			int x=s.indexOf('B');
			int y=s.indexOf('y');
			//if (s.substring(x,y))
			//{
				//for(int j=y;j>=y;j++)
				//{
					//break;
				//}
			//}
			ss=ss+s.charAt(i);
			System.out.println("reversing the string");
		}
		System.out.println(ss.toLowerCase());
	}

}
