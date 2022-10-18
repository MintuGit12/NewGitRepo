package collection;

import java.util.TreeSet;

public class PrintTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(new MyComparator());
		ts.add(105);
		ts.add(10);
		ts.add(206);
		ts.add(217);
		ts.add(503);
		ts.add(53);
		ts.add(0);
		System.out.println(ts);
	}

}
