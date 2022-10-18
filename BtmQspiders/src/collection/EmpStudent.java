package collection;

import java.util.TreeSet;

public class EmpStudent {

	public static void main(String[] args) {
	TreeSet<Object> ts=new TreeSet<>();
	//ts.add(new Employee(102, 20,"Bhanu"));
	ts.add(new StudentDetails(120,"Vibhu", 11234));
	//ts.add(new Employee(122, 20,"Nilesh"));
	//ts.add(new Employee(92, 30,"Vikrant"));
	ts.add(new StudentDetails(12,"Aman", 112344));
	ts.add(new StudentDetails(12,"Vishal", 21234));
	System.out.println(ts);
	}

}
