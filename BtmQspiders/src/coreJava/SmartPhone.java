package coreJava;
class Phone
{
	static void use()
	{
		System.out.println("use of all phone");
	}
	 void useMe()
	{
		System.out.println("use of all phone in phone cat");
	}
}
public class SmartPhone extends Phone{
	static void use()
	{
		System.out.println("use of all mobile phone");
	}
	 void useMe()
		{
			System.out.println("use of all mobilephone in mobilephone cat");
		}
	public static void main(String[] args) {
		
		SmartPhone  s=new SmartPhone ();
		s.use();
		SmartPhone .use();
		use();
		//super.use();cannot use super in static context
		Phone p=new Phone();
		p.use();
		Phone p1=new SmartPhone ();
		p1.use();
//now with non static variable
		SmartPhone  s1=new SmartPhone ();
		s1.useMe();
		Phone p2=new SmartPhone();
		p2.useMe();
		SmartPhone  s2=(SmartPhone)p2;//downcasting
		s2.useMe();
	}

}
