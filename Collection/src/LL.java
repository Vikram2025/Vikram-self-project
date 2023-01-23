import java.util.*;
public class LL {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("chirag");
		ll.add(98);
		ll.add(0, "name");
	
		System.out.println(ll);
		
		LinkedList ll1= new LinkedList();
		ll1.add("vikram");
		ll1.add("smart");
		System.out.println("before inserting output");
		System.out.println(ll1);
		ll1.addAll(1, ll);
		System.out.println("after  inserting output");
		System.out.println(ll1);
		

	}

}
