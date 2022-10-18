package coreJava;

public class String1 {

	public static void main(String[] args) {
		String s1="ram";
		String s2="ram";
		String s3=new String("ram");
		String s4=s1.substring(0,1);
		System.out.println(s4);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		int x=100;
		Integer i1=Integer.valueOf(x);
		System.out.println(i1);
		int x1=i1.intValue();
		System.out.println(x1);
	}

}
