package coreJava;
interface Courses
{
	String branch="BTM";
	void coursesComp();
	
}
class Person
{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void coursesComp()
	{
		System.out.println("Persson going to attend course");
		System.out.println(name);
		System.out.println(age);
	}
}
class QStudent1 extends Person implements Courses
{
String	qid ;
QStudent1(String qid,String name,int age)
{
	super(name,age);
	this.qid=qid;
}
public void coursesComp()
{
	System.out.println("QSpider couse will complete in 1yr");
	System.out.println(qid);
	System.out.println(name);
	System.out.println(age);
}
}

class JStudent1 extends Person implements Courses
{
String	jid ;
JStudent1(String jid,String name,int age)
{
	super(name,age);
	this.jid=jid;
}
public void coursesComp()
{
	System.out.println("JSpider course will complete in 1yr");
	System.out.println(jid);
	System.out.println(name);
	System.out.println(age);
}
}

public class DriverMulAbstract {

	public static void main(String[] args) 
	{
	Courses c=new QStudent1("FR123","ROHIT",23);
	c.coursesComp();
	Person p=new JStudent1("MNKL234","sarfaraz",27);
	p.coursesComp();
	Person p2=new Person("Golu",35);
	p2.coursesComp();
	}

}
