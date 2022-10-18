package ExamQstn;

public class AnonymusInnerLocalClass {
	String name;
	int roll;
	int ph;
	AnonymusInnerLocalClass(String s,int i,int ph)
	{
		name=s;
		roll=i;
		this.ph=ph;
	}
	public static void main(String[] args) {
		AnonymusInnerLocalClass a=new AnonymusInnerLocalClass("Ramesh",123,985747327);
		//or we can create anonymus inner class
		AnonymusInnerLocalClass a1=new AnonymusInnerLocalClass("Rahul",1256,95857427)
				{
			public String toString()
			{
				return "My name is "+name;
			}
			public int hashCode()
			{
				return roll;
			}
			void m1()
			{
				System.out.println("I am anonymus class ");
			}
				};
				System.out.println(a);System.out.println(a1);
	}
	
}
