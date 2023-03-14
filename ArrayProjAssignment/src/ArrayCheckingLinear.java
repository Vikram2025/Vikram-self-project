import java.util.*;
public class ArrayCheckingLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {23,45,66,75,44,33,55,22};
Scanner scan = new Scanner(System.in);
boolean flag = false;
System.out.println(" user enter your value to be found in the given array");
int myValue= scan.nextInt();
for(int i = 0;i<arr.length;i++) {
	if (myValue == arr[i])
	{
		System.out.println("your value " +myValue+ " has been found  in the index " + i);
		flag= true;
		break;
	}
}
if(flag == false)
System.out.println("the value which you have entred isn't present in give array");

	}

}
