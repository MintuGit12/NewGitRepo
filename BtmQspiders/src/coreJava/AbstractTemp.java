package coreJava;
/*abstract class Temp2
{
	int x;
	int y;
	abstract void set();
	public void show()
	{
		System.out.println("the val of x"+x);
		System.out.println("the val of y"+y);
	}
}*/

public abstract class AbstractTemp 
{
void set()
{
	//this.x=x;
	//this.y=y;
}
	public static void main(String[] args) {
		String s="boy";
		String s2="boy";
		
		String s1=new String("Boy");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s));
		System.out.println(s.compareTo(s2));
		System.out.println(s.charAt(0));
		String s4=String.valueOf(123);
		System.out.println(s4);
		System.out.println(s4.indexOf('2'));
		System.out.println(s.contains("z"));
		System.out.println(s.substring(0,2));
		System.out.println(s.concat(s2));
		System.err.println(s.replace('b','c'));
	}

}
