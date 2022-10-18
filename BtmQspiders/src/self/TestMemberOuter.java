package self;

//import self.TestMemberOuter1.Inner;

class TestMemberOuter{
	private int x=100;
	class Inner
	{
		void show()
		{
	System.out.println(x);
	}
	}
public static void main(String[] args) {
	TestMemberOuter t=new TestMemberOuter();
	TestMemberOuter.Inner i=t.new Inner();
	i.show();
}
}