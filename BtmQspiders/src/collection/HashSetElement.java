package collection;
import java.util.*;
public class HashSetElement {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>(); 
		hs.add(134);
		hs.add(678);
		hs.add(13);
		hs.add(4);
		hs.add(13400);
		hs.add(1234);
		hs.add(111111);
		hs.add(10000);
		hs.add(134);
		System.out.println(hs);
		System.out.println("...........................");
		Iterator<Object> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("///////////////");
		ArrayList<Object> al=new ArrayList<Object>(hs);
		al.add(2,134);
		ListIterator li=al.listIterator();
		/*while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println(".........................");*/
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println("..........................................");
		for(Object o:al)
		{
			System.out.println(o);
		}
		TreeSet<Object> ts=new TreeSet<>(al);
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(ts);
		TreeSet<Object> tsd=(TreeSet<Object>)ts.descendingSet();
		System.out.println(".................................");
		System.out.println(tsd);
		//Collections.sort(tsd);
	}

}
