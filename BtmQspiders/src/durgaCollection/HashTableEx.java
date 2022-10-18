package durgaCollection;
import java.util.*;
public class HashTableEx {

	public static void main(String[] args) {
		HashSet h=new HashSet(10,15);
		System.out.println(h.add("a"));
		System.out.println(h.add("a"));
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(100);
		System.out.println(h);//op is according to the hash code
		System.out.println(h);
		LinkedHashSet l=new LinkedHashSet();
		l.add("A");
		l.add("B");
		l.add("Z");
		l.add(null);
		l.add(100);
		l.add("B");
		l.add("last");
		System.out.println(l);
		//SortedSet s=SortedSet SortedSet();
		//s.first();
	}

}
