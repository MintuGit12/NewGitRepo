package coreJava;
class Rect
{
	private int length;
	private int bredth;
	Rect(int length,int bredth)
	{
		this.length=length;
		this.bredth=bredth;
	}
	public int getLen()
	{
		return length;
	}
	public int getBre()
	{
		return bredth;
	}
	public void setLen(int length)
	{
		this.length=length;
	}
	public void setBre(int bredth)
	{
		this.bredth=bredth;
	}
	public float area()
	{
		return length*bredth;
	}
}
public class DriverRect {

	public static void main(String[] args) {
		Rect r=new Rect(23,12);
		System.out.println(r.area());

	}

}
