package self;
class A23
{
	
}
class B78 extends A23
{
	
}
public class ObjectTypecasting {

	public static void main(String[] args) {
	/*	Object o=new String("durga");
		StringBuffer sb=(StringBuffer)o;
		System.out.println(sb);*/
		A23 a=new B78();
		Object o=(Object)a; 

	}

}
