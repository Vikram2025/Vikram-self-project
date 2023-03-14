import java.util.*;

class MyClass implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		String In1 = (String)obj1;
		String In2= (String)obj2;
		Integer L1=In1.length();
		Integer L2=In2.length();
		
    
	
   
	 if (L1<L2)
			return -1;
	 else if (L2<L1)
		return +1;
	 else 
	 return  In2.compareTo(In1);

		
	}
	
}

public class CompatorInteger {

	public static void main(String[] args) {
		TreeSet TS= new TreeSet( new MyClass());
		
		TS.add("praful");
		TS.add("vik");
		TS.add("aman");
		TS.add("chirag");
		TS.add("vikram");
		System.out.println(TS);
		
	}

}
