package collection;
import java.util.*;
public class CollectionClassConvert {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(66);
		al.add(998);
		al.add(24);
		al.add(2);
		al.add(2);
System.out.println(al);
//to sort it
TreeSet<Integer> ts=new TreeSet<>(al);
System.out.println(ts);//sorted order
HashSet<Integer> hs=new HashSet<>();
hs.add(28);
hs.add(28);
hs.add(45);
hs.add(45);
hs.add(90);
System.out.println(hs);
//hs.add(2,34);
ArrayList<Integer> al1=new ArrayList<>(hs);
System.out.println(al1);
//System.out.println((Collections.sort(al1));
	}

}
