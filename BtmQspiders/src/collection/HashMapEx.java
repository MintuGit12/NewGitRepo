package collection;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Object,Object> hs=new HashMap<Object,Object>();
		hs.put("name","amit");
		hs.put("name","amirrr");
		hs.put(null,null);
		hs.put(null,null);
		hs.put("firstname","amirrr");
		hs.putIfAbsent("name","ankur");
		System.out.println(hs);
		System.out.println(hs.get("amirrr"));
		TreeMap<Object,Object> tm=new TreeMap<Object,Object>();
		tm.put("s1","manish");
		tm.put("s2",null);
		tm.put("s3","manishaa");
		System.out.println(tm);
	}

}
