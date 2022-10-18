package collection;
import java.util.*;
import java.util.ListIterator;
public class HashSetEX {

	public static void main(String[] args) {
	HashSet<String> h1=new HashSet<>();
	h1.add("ramesh");
	h1.add("rahul");
	h1.add("aaryan");
	h1.add("aaryan");
	h1.add("ramesh");
	h1.add("rishav");
	h1.add("rishav");
	h1.add("nilesh");
	System.out.println("hashset elements :"+h1);
	/*ListIterator<String> it=h1.listIterator();
	while(it.hasPrevious())
	{
		System.out.println(it.previous());
	}*/
	//Enumeration<String> e=h1.enumerator();
	}

}
