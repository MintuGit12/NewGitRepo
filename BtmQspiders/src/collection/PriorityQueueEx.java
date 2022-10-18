package collection;
import java.util.Collection;
import java.util.PriorityQueue;
public class PriorityQueueEx {

	public static void main(String[] args) {
	PriorityQueue<String> p=new PriorityQueue<>();
	p.add("vikash");
	p.add("vivek");
	p.add("lavanya");
	p.add("naresh");
	p.add("rahul");
	p.add("shailesh");
	System.out.println("elements is queue are :"+p);
	System.out.println("peek method is :"+p.peek());
	System.out.println("after peek :"+p);
	System.out.println("use of poll :"+p.poll());
	System.out.println("after poll method :"+p);
	System.out.println("elements are :"+p.element());
	System.out.println("remove element :"+p.remove());
	System.out.println(+p);
	}

}
