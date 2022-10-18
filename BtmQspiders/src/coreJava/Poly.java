package coreJava;
class Poly1
{
	int x=71628278;
	static void m1()
	{
		System.out.println("hiiiiii");
	}
}
public class Poly extends Poly1 {
int x=9894;
static void m1()
{
	System.out.println("m here");
}
void m7()
{
	int x=300;
	System.out.println(x);
	System.out.println(this.x);
	System.out.println(super.x);
}
	public static void main(String[] args) {
		
		Poly p=new Poly();
		p.m7();
		p.m1();
	}

}

