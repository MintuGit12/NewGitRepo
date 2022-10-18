package stringConcept;

public class StringImmutable {

	public static void main(String[] args) {
		String s1="java";
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		s1=s1.concat(" is a");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		s1=s1.concat(" programing language");
		System.out.println(s1.hashCode());
		s1=s1.toLowerCase();
		System.out.println(s1.hashCode());
		System.out.println(s1);
		s1=s1.trim();
		System.out.println(s1.hashCode());
	}

}
