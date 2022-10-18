package collection;
import java.util.*;
public class ListIteratorEx {

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(199);
	al.add(489);
	al.add(399);
	al.add(286);
	al.add(195);
	al.add(1672);
	al.add(3745);
	ListIterator<Integer> li=al.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println(li.previous());
	System.out.println("..............................");
	while(li.hasPrevious())
	{
		int x=li.previous();
		if(x==195)
		{
			li.add(456789);
		}
		System.out.println(li.previous());
	}
	System.out.println(li.hasPrevious());
	//System.out.println(li.previous());//listIterator ends
	//ArrayList<Integer> al1=(ArrayList<Integer>)li;
	//System.out.println(al1);
	}

}
