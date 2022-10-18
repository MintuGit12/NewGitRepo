package stringConcept;

public class StringImmutable2 {

	public static void main(String[] args) {
		String s1="java";
		String s2=new String("java");
		//content based hash cod so hash code will be same
		System.out.println(s1.hashCode()==s2.hashCode());
		//adress will be diff becose of heap and pool
		System.out.println(s1==s2);
		//content is same
		System.out.println(s1.equals(s2));
	}

}
