import java.util.*;
public class ADQ {

	public static void main(String[] args) {
	ArrayDeque adq= new ArrayDeque();
	adq.add(12);
	adq.add(47);
	adq.add(34);
	adq.add(110);
	adq.add(10);
	adq.add(121);
	adq.add("vikram");
	adq.add(32);
	adq.add("vikram");
	Spliterator SP= adq.spliterator();
	
	
   System.out.println(adq);
	}

}
