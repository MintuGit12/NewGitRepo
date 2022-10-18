package part3java;

public class StringConstPool {
public Object toString()
{
	return "string object";
}
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		System.out.println(o1.equals(o2));
		StringConstPool s=new StringConstPool();
		System.out.println(o1.equals(s));
		String s1="rohit";
		String s2="rohit";
		String s3=new String("rohit");
		String s4=new String("rohit");
		if((s1==s2)==(s1.equals(s2)))
		{
			System.out.println("true is here");
		}
		System.out.println(s3.equals(s4));
		//s1="ramesh";
		 System.out.println(s1.equals(s2));
		if(s1==s2)
		{
			System.out.println("same duplicatedd address");
		}
		System.out.println(s);
		/*else
		{
			System.out.println("not same reference");
		}
		if(s1==s3)
		{
			System.out.println("not duplicate address");
		}
		if(s4==s3)
		{
			System.out.println("different object refernce");
		}*/
	}

}
