package coreJava;

class ALL
{
	int x;
	int y;
	private ALL()
	{
		super();
		System.out.println("hiiiiiiiii");
	}
	ALL(int x)
	{
		
		this();
	}
	
}
public class Concept extends ALL 
{
	Concept(int x)
	{
		super(x);
	}
	public static void main(String[] args) {
		Concept c=new Concept(1000);

	}

}
