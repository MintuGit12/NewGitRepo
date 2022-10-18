package durgaCollection;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("durga");
		l.add(101);
		l.add(null);
		l.add("durga");
		System.out.println(l);
		l.addFirst("softwere");
		l.addLast("solution");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
	}

}
