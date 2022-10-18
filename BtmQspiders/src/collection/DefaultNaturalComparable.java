package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Emp implements Comparable
{
	String eName;
	int eId;
	Emp(String eName,int eId)
	{
		this.eId=eId;
		this.eName=eName;
	}
	public String toString()
	{
		return eName+"-->>>"+eId;
	}

	@Override
	public int compareTo(Object o) {
		int eId1=this.eId;
		Emp e2=(Emp)o;
		int eId2=e2.eId;
		if(eId1>eId2)
		return +1;
		else if(eId1<eId2)
			return -1;
		else
			return 0;
	}
	
}
public class DefaultNaturalComparable {

	public static void main(String[] args) {
		//for default natural sorting order
Emp e1=new Emp("varun",100);
Emp e2=new Emp("jai",200);
Emp e3=new Emp("viru",50);
Emp e4=new Emp("Nagesh",150);
Emp e5=new Emp("Arjun",100);
TreeSet<Emp> ts=new TreeSet<>();
ts.add(e1);
ts.add(e2);
ts.add(e3);
ts.add(e4);
ts.add(e5);
System.out.println(ts);
//for sorting order according to our need
TreeSet<Emp> ts1=new TreeSet<>(new MyComp12());
ts1.add(e1);
ts1.add(e2);
ts1.add(e3);
ts1.add(e4);
ts1.add(e5);
System.out.println(ts1);
	}

}
class MyComp12 implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		String s1=e1.eName;
		String s2=e2.eName;
		return s1.compareTo(s2);
	}
}