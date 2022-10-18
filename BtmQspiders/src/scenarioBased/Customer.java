package scenarioBased;

public class Customer extends Person {
int cid;
String add;
	Customer(String name, int age,int cid,String add) {
		super(name, age);
		this.cid=cid;
		this.add=add;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", add=" + add + ", age=" + age + ", name=" + name + "]";
	}
	

}
