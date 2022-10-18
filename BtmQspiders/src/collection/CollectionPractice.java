package collection;
import java.util.*;
public class CollectionPractice {

	public static void main(String[] args) {
		ArrayList<Object> ar=new ArrayList<Object>();
		List<Object> ar1=Collections.synchronizedList(ar);
		ar1.add(10);
		ar1.add("hiii");
		ar1.add(10.66);
		ar1.add('c');
		ar1.add(true);
		System.out.println(ar);
		ar1.set(0, null);
		System.out.println(ar);
		System.out.println(ar.indexOf(ar1));
		ar1.add(1, "billaa");System.out.println(ar1);
		ListIterator i=ar1.listIterator();
		while(i.hasNext())
		{
			
			System.out.println("......"+i.next());
		}
		System.out.println("???????????");
		while(i.hasPrevious())
		{
			System.out.println("......"+i.previous());
		}
		System.out.println("linkedList..............................");
		LinkedList<Object> ll=new LinkedList<>(ar1);
		ll.addFirst(null);
		ll.addLast("hhasjg");
		ListIterator i1=ar1.listIterator();
		while(i1.hasNext())
		{
			System.out.println("......"+i1.next());
		}
		System.out.println("???????????");
		while(i1.hasPrevious())
		{
			System.out.println("......"+i1.previous());
		}
		ArrayList<String> ar2=new ArrayList<>();
		ar2.add("hii");
		ar2.add("jason");
		ar2.add("jency");
		ar2.add("adam");
		ar2.add("alert");
	Collections.sort(ar2);
	Collections.sort(ar2,Collections.reverseOrder());
	for(String s1:ar2)
	{
		System.out.println(s1);
	}
	TreeSet<String> ts1=new TreeSet<>(ar2);
	//System.out.println(ts1);
	
	TreeSet<String> ts2=(TreeSet<String>)ts1.descendingSet();
	//System.out.println(ts2);
	}

}
