package durgaCollection;
import java.util.*;
public class ListEx12 {

	public static void main(String[] args) {
	ArrayList<Integer> ar=new ArrayList<>();
	ar.add(10);
	ar.add(110);
	ar.add(100990);
	ar.add(111000);
	ar.add(100);
	System.out.println(ar);
	for(Integer i:ar)
	{
		System.out.println(i);
	}
	Collections.sort(ar);
	ListIterator<Integer> li=ar.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println(".................................");
	Collections.sort(ar,Collections.reverseOrder());
	ListIterator<Integer> li1=ar.listIterator();
	while(li1.hasNext())
	{
		System.out.println(li1.next());
	}
	TreeSet<Integer> tm=new TreeSet<>(ar);
	System.out.println(tm);
	TreeMap<Integer> tm1=(TreeMap)tm.descendingSet();
	}

}
