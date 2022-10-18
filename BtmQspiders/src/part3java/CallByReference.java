package part3java;

public class CallByReference {

	int x;
	int y;
	int z;
	void change(CallByReference c)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		x=899;
		y=003;
		z=632;
	}
	public static void main(String[] args) 
	{
		CallByReference c=new CallByReference();
		CallByReference c1=new CallByReference();
		c.x=100;
		c.y=399;
		c.z=666;
		c.change(c);
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		c1.x=199456;
		c1.y=467999;
		c1.z=666943;
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
	}

}
