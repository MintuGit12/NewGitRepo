package scenarioBased;

import java.util.ArrayList;
import java.util.List;

public class CoolectionScenario {

	public static void main(String[] args) {
		List<Person> li=new ArrayList<Person>();
		li.add(new Student("sumit",21,121,87.56f));
		li.add(new Student("Amit",22,122,67.6f));
		li.add(new Employee("Amitosh",38,221,65000));
		li.add(new Employee("Amitosh",38,222,65000));
		li.add(new Customer("nagesh",56,321,"Banglore"));
		li.add(new Customer("uday",46,322,"Manglore"));
	}
Person epar=getElderPerson(persons);
System.out.println(epar);
}
