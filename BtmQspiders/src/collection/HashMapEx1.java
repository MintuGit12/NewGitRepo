package collection;

import java.util.*;
public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<Object,String> hm=new HashMap<Object,String>();
		hm.put("Student1Name","alex");
		hm.put("Student2Name","adam");
		hm.put("Student5Name","aladin");
		hm.put("Student4Name","george");
		hm.put("Student3Name","kilie");
		hm.put("Student6Name","mahi");
		hm.put("Student7Name","virat");
		System.out.println(hm);//random order
		hm.put("Student2Name","amazon");
		HashMap<Object,Object> hm1=new HashMap<Object,Object>();
		hm1.putAll(hm);
		hm1.put("Student8Name","virat...................");
		hm1.put("null","virat");
		System.out.println(hm1);
		/*System.out.println(hm1);
		System.out.println(hm.get("Student1Name"));
		System.out.println("................................");
		System.out.println(hm.entrySet());
		System.out.println("...............................");
		System.out.println(hm.values());
		System.out.println("..........................");
		System.out.println(hm.keySet());
		System.out.println(hm.size());
		hm.putIfAbsent("ram", "400000");
		System.out.println(hm.values());
		TreeMap<Object,Object> tm2=new TreeMap<Object,Object>(hm);
		System.out.println(tm2.values());
		//tm2.add("Student2Name",null);
	System.out.println(hm.equals(tm2));
		System.out.println("................................");
		System.out.println(tm2);*/
		
	}

}
