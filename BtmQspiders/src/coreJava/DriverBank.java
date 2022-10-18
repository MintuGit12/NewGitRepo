package coreJava;
class Bank
{
	public float getRateOfInterest()
	{
		return 0;
	}
	public void show()
	{
		System.out.println( "Interest is "+getRateOfInterest());
	}
	public void disp1()
	{
		System.out.println( "bank of all bank" );
	}
}
class Sbi extends Bank{
	public float getRateOfInterest()
	{
		return 7.5f;
	}
	public void show()
	{
		System.out.println( "Interest is "+getRateOfInterest());
	}
	public void disp2()
	{
		System.out.println( "sbi bank" );
	}
}
class Icici extends Bank
{
	public float getRateOfInterest()
	{
		return 6.5f;
	}
}
class Uco extends Bank
{
	public float getRateOfInterest()
	{
		return 5.5f;
	}
	public void show()
	{
		System.out.println( "Interest is "+getRateOfInterest());
	}
}
public class DriverBank {

	public static void main(String[] args) {
		Bank b=new Bank();
		b. getRateOfInterest();
		b.show();
		Bank b2=new Sbi();
		//b2. getRateOfInterest();
		b2.show();
		b2.disp1();
	}
}

