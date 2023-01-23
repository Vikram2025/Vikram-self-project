import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class PQ {

	public static void main(String[] args) {
		PriorityQueue PQ = new PriorityQueue();
		PQ.add(11);
		PQ.add(10);
		PQ.add(122);
		PQ.add(1);
		PQ.add(18);
		PQ.add(14);
		PQ.add(1);
		
		System.out.println(PQ);
		System.out.println("collect it by using iterator class and method");
		PriorityQueue PK = new PriorityQueue();
		PK.add("vikram");
		PK.add("praful");		
		PK.add("sai");
		PK.add("venky");
		
		System.out.println(PK);

 Iterator IT = PQ.iterator();
	 
		//Cal.retainAll(PQ);
		//Cal.spliterator();
		//Cal.addAllAbsent(Cal);
	
		
	 
	// while(IT.hasNext())
	// {
	//	 System.out.print(IT.next() + " ");
	//	 PQ.add(133);
		 
	// }

 CopyOnWriteArrayList Cal= new CopyOnWriteArrayList();
 Cal.add(11);
	Cal.add(10);
	Cal.add(122);
	Cal.add(1);
	Cal.add(100);
	Cal.add(14);
	Cal.addAllAbsent(PQ);
	Cal.add(1);
	Cal.add(22);
	 Iterator ITI = Cal.iterator();
	 
	 while(ITI.hasNext())
	 {
		 System.out.println(ITI.next());
		 Cal.add(122);
		Cal.add(182);
		//System.out.print(Cal);
	 }
	 }
	}



