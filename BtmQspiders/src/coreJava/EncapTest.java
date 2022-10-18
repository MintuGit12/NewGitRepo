package coreJava;
class Number
{
	private int x;
	public int show()
	{
		return getNum();
	}
	private int getNum()
	{
		return x;
	}
	private void setNum(int x)
	{
		this.x=x;
	}
	Number(int x)
	{
		setNum(x);
	}
}
public class EncapTest {

	public static void main(String[] args) {
		Number n=new Number(200);
		//n.setNum(200);
		//System.out.println(n.getNum());
		System.out.println(n.show());

	}

}
