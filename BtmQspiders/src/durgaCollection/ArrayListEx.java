package durgaCollection;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
	ArrayList al=new ArrayList(10);
	al.add(10);
	al.add("a");
	al.add('a');
	al.add(null);
	al.add(10.13);
	System.out.println(al);
	al.add(2,"a");
	System.out.println(al);
	al.remove(2);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.contains("a"));
	al.clear();
	

	}

}
