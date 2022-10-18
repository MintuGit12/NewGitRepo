package durgaCollection;
import java.util.*;
public class ListIteratorEx {

	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("mahesh");
	ll.add("renuka");
	ll.add("suman");
	ll.add("amit");
	ListIterator li=ll.listIterator();
	while(li.hasNext())
	{
		System.out.print(li.next()+" ");
	}
	while(li.hasPrevious())
	{
		String s=(String)li.previous();
		if(s=="renuka")
			li.remove();
		else if(s=="amit")
			li.set("amitabh");
		else if(s=="suman")
			li.add("suman saurabh");
		System.out.print(li.previous());
	}
	System.out.println(ll);
	}

}
