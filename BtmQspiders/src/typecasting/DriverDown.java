package typecasting;
class Phone
{
	int cost;
	String type;
	private String owner1;
	void use()
	{
		System.out.println("music call....... parent");
		System.out.println("private variable paremnt owner "+owner1);
		System.out.println("cost is "+cost+" type is "+type);
	}
	static void useMe()
	{
		System.out.println("music call of........ parent");
		
	}
	Phone(int cost,String type,String owner1)
	{
		this.cost=cost;
		this.type=type;
		this.owner1=owner1;
	}
}
class MPhone extends Phone
{
	private String owner2;
	void use()
	{
		System.out.println("music call vediocall internet fb insta...child class");
		
	}
	static void useMe()
	{
		System.out.println("music call vediocall internet fb insta of child...child class");
		
	}
	MPhone(String owner2,int cost,String type,String owner1)
	{
		super(cost,type,owner1);
		this.owner2=owner2;
	}
}
public class DriverDown {

	public static void main(String[] args) {
		Phone p11=new Phone(12000,"nokia expressmusic","rohit");
		p11.use();
		/*Phone p=new MPhone("ramesh",12000,"nokia expressmusic","rohit");
		p.use();//child class
		p.useMe();//parent class
		MPhone m=(MPhone)p;
		m.use();//child class
		m.useMe();//child class*/
	}

}
