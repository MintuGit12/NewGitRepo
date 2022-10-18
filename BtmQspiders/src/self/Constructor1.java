package self;

public class Constructor1 {
	private Constructor1(int i)
	{
		System.out.println("when wwe will make paramiterized connst");
	}
	protected Constructor1()
	{
		System.out.println("we have to also make default const");
	}
	public static void main(String[] args) {
		Constructor1 c1=new Constructor1(10);
		Constructor1 c2=new Constructor1();

	}

}
