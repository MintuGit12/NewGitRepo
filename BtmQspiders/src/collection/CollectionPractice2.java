package collection;
import java.util.*;
public class CollectionPractice2 {

	public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("hii");
	hs.add("hii");
	hs.add(563.87);
	hs.add('a');
	hs.add(true);
	hs.add(252454);
	System.out.println(hs);
	Iterator i=hs.iterator();
	while(i.hasNext())
	{
	
		System.out.println("......"+i.next());
	}
	LinkedHashSet<String> lhs=new LinkedHashSet<>();
	lhs.add("hii");
	lhs.add("hii");
	lhs.add("subh");
	lhs.add("here");
	lhs.add("ronny");
	lhs.add("2345");

	Iterator i1=lhs.iterator();
	while(i1.hasNext())
	{
	
		System.out.println("......"+i1.next());
	}

	TreeSet ts=new TreeSet();
	ts.add("ram");
	ts.add("shyam");
	ts.add("arun");
	ts.add("xavier");
	ts.add("alam");
	//ts.add(null);
	System.out.println(ts);
	}

}
