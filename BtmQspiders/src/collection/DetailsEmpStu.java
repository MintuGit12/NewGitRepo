package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class DetailsEmpStu{

	public static void main(String[] args) {
	TreeSet<Object> ts=new TreeSet<>();
	ts.add(new Employee(102, 25000,"Manish"));
	ts.add(new StudentDetails(42, "Naresh", 78961234));
	ts.add(new Employee(112, 27000,"Yugesh"));
	ts.add(new StudentDetails(64, "Satyendra",876523));
	
	}



}
