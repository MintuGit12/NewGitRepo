package durgaCollection;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add('s');
		s.add(0, "hii");
		System.out.println(s.search('s'));
		System.out.println(s.search("hello"));
	}

}
