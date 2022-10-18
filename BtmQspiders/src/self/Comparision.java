package self;

public class Comparision {
int x;
	public static void main(String[] args) {
		Comparision c1=new Comparision();
		c1.x=100;
		Comparision c2=new Comparision();
		c2.x=100;
		int x1=200;
		int y=200;
		System.out.println(x1==y);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}

}
