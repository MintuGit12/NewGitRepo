package coreJava;

public class TestOverloading 
{
	int b=78;
static void show()
{
	System.out.println("show 0 arg");
}
static void show(float a)
{
	int b=4500;
	System.out.println("show long arg"+b);
}
static void show(int a,float b)
{
	System.out.println("show int-float arg");
}
static void show(float b,int a)
{
	System.out.println("show float-int arg");
}

	public static void main(String[] args) {
		
TestOverriding t=new TestOverriding();
	t.show();
	t.show(10,10f);
	show(20l);
	}

}