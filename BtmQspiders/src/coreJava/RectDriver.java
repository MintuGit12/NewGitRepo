package coreJava;
import java.util.Scanner;
class Rectangle
{
	private float len;
	private float bre;
	Rectangle(float bre,float len)
	{
		setLen(len);
		setBre(bre);
	}
	public void setBre(float bre)
	{
		this.bre=bre;
	}
	public void setLen(float len)
	{
		this.len=len;
	}
	public float area()
	{
		return len*bre;
	}
}
public class RectDriver {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter length and bredth to find area of rectangle");
	float len=s.nextFloat();
	float bre=s.nextFloat();
Rectangle r=new Rectangle(bre,len);
System.out.println("area of the rectangle"+r.area());
	}

}
