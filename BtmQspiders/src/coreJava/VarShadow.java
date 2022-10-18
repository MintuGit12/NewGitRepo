package coreJava;

public class VarShadow 
{
	static int b=400;
int a=20;
static void show1()
{
	VarShadow v=new VarShadow();
	System.out.println(v.a);
	//System.out.println(VarShadow.a);
	//System.out.println(this.a);	
//System.out.println(a);	
System.out.println(b);	
System.out.println(VarShadow.b);
System.out.println(v.b);
}
void disp()
{
	VarShadow s=new VarShadow();
	System.out.println(s.b);
	System.out.println(b);
	System.out.println(VarShadow.b);
	System.out.println(this.b);
	System.out.println(a);
	System.out.println(this.a);
	//System.out.println(VarShadow.a);
	System.out.println(s.a);
}

void show()
{
	System.out.println(this.a);
}
	public static void main(String[] args) {
		VarShadow v=new VarShadow();
		int a=300;
		System.out.println(v .a);
		//System.out.println(this.a);
		v.show1();
	}

}
