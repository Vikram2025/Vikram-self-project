import java.util.*;
public class Demo1 {
public static void main (String[]args) {
	Scanner scan= new Scanner(System.in);
	int [] ar = new int [6];
	for(int i=0; i<ar.length; i++)
	{
	System.out.println("enter the number of bus" + i);
	ar[i] = scan.nextInt();
	
	}
	
	System.out.println("the bus numbers are given below");
	for(int i=0; i<ar.length; i++)
	{
		System.out.print(ar[i] + " ");
	}
}
}

