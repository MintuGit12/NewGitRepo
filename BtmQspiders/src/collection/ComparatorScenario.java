package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorScenario {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>(new MyComp());
		ts.add("Adarsh");
		ts.add("Manoj");
		ts.add("Biswajeet");
		ts.add("Suman");
		ts.add("Zeba");
		System.out.println(ts);
	}

}
class MyComp implements Comparator
{


@Override
public int compare(Object o1, Object o2) {
String s1=(String)o1;
String s2=(String)o2;
	//return s1.compareTo(s2);// ascending
return -s1.compareTo(s2); //decending
//return s2.compareTo(s1);//decending
//return -s2.compareTo(s1);//ascending
//return +1;//insertion order
//return -1;//reverse of insertion order
//return 0;//return only 1st ele other are treated as duplicate
}
}