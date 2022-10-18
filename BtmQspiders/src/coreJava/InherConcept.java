package coreJava;

class P
{
public void m1()
{
	System.out.println("hiiiii");
}
public void m1(int i)
{
	System.out.println("overloaded method"+i);
}
//public void m3();
}
class InherConcept extends P
{
	public void m2()
	{
	System.out.println("helooooo");
	}
	public void m1()
	{
		System.out.println("hiiiiieeerrrr");
	}
	public static void main(String[] args)
	{
		P p=new P();
		p.m1(78);
		InherConcept i=new InherConcept();
		i.m1();
		P p1=new InherConcept();
		//p1.m2();//dis will not rum because parent class holding chid obj cannot run child method
		p1.m1();
		//InherConcept i2=new P();//not possible
		
		
		}
}
/*class P extends InherConcept
{
	public static void main(String[] args)
	{
	P p=new P();
	}
}cyclic inheritence not possible in java*/

