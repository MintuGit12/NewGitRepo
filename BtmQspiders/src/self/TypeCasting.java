package self;

public class TypeCasting {
	

	public static void main(String[] args) {
		Integer i=new Integer(10);
		Number n=(Number)i;
		Object o=(Object)n;
		Object o1=new Integer(100);
		if(n==o)
		{
			if(o==i)
			System.out.println("hiiii");
		}

	}

}
