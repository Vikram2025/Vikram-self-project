import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public  class MyPredicate
{
//@Override
//  public boolean test(Integer t) {
//	if(t<10) {
//		return true;
//	}
//	else
//	return false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Predicate<Integer>  P1 = new MyPredicate();
 List <Integer> arr = Arrays.asList(1,3,4,56,7,8,9,0,-5,-3,-7); 
 Predicate<Integer> pre =  (x)->x >7;
		

//		 
// Predicate<Integer> pre1 = (x)-> (x%2==0);

  ArrayList<Integer> collection = (ArrayList<Integer>) arr.stream().filter(pre).collect(Collectors.toList());
System.out.println(collection);

//System.out.println(Result);
	}

}
