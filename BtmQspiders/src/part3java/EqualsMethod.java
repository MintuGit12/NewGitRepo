package part3java;

public class EqualsMethod
{
	int id;
	
   public boolean equals(Object o)
    {
	   EqualsMethod e3=(EqualsMethod)o;
	   return e3==this;
    }
	public static void main(String[] args) {
		EqualsMethod e1=new EqualsMethod();
		e1.id=299;
		EqualsMethod e2=new EqualsMethod();
		e2.id=999;
System.out.println(e1==e2);//false
System.out.println(e1.equals(e2));//false
System.out.println(e1.equals(e1));//true
	}

}
