package collection;

import java.util.Comparator;
import java.util.TreeSet;

//wap to print strong and string buffer sorted acc to length and if length is
//same sort them acc to the alphabetical order
public class ComparatorLogic {

	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<Object>(new MyComparator1());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add(new StringBuffer("A"));
System.out.println(t);
	}

}
class MyComparator1 implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
	String s1=o1.toString();
	String s2=o2.toString();
int l1=s1.length();
int l2=s2.length();
//decending
/*if(l1>l2)
	return -1;
else if(l1<l2)
	return +1;
else
	return s1.compareTo(s2);*/
//Ascending
if(l1>l2)
return +1;
else if(l1<l2)
	return -1;
else
	return s1.compareTo(s2);
	}
	
}