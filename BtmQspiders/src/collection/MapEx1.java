package collection;
import java.util.*;
public class MapEx1 {

	public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(101, "durga");
	hm.put(102, "ravi");
	hm.put(null, "dashwant");
	hm.put(103, "dashwant");
	hm.put("anger", "hii");
	hm.put("eager", "hii");
	System.out.println(hm);
	//System.out.println(hm.getKey());
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	System.out.println(hm.entrySet());
	System.out.println(hm.size());
	System.out.println(hm.get(101));
	System.out.println(hm.containsKey(102));
	System.out.println(hm.containsValue("durga"));
	Set s1=hm.entrySet();
	Iterator it=s1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}

}
