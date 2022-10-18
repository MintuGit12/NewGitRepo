package self;

public class Constructor_InsBlock 
{
	{
		count++;
	}
static int count=0;

	Constructor_InsBlock()
	{
		//count++;
	}
	Constructor_InsBlock(int x)
	{
		//count++;
	}
	Constructor_InsBlock(double d)
	{
		//count++;
	}
	void Constructor_InsBlock()//can be happen but having classname method is worst programing practice
	{
		
	}
	public static void main(String[] args) {
		Constructor_InsBlock c1=new Constructor_InsBlock();
		Constructor_InsBlock c2=new Constructor_InsBlock(10);
		Constructor_InsBlock c3=new Constructor_InsBlock(10.5);
		System.out.println("no of object created " +count);

	}

}
