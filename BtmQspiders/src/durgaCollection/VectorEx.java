package durgaCollection;
import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
	Vector v=new Vector(3,5);
	v.addElement(10);
	v.addElement(100);
	v.addElement(1000);
	System.out.println(v);
	System.out.println(v.capacity());
	v.add(1120);
	System.out.println(v.capacity());
	v.remove(1);
	System.out.println(v);
	}

}
