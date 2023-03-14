
import java.util.Scanner;

public class arrayBinary {

        public static void main (String [] arrg) {
        	int [] arr= {1,23,45,66,77,88,99,100,152};
        	Scanner scan = new Scanner(System.in); 
        	System.out.println("enter the value to be found in the given array");
        	int MyValue= scan.nextInt();
        	int min= 0;
        	int max = arr.length-1;
//        	int mid = min+max/2;
        	//System.out.print(mid);//
        	while(min<=max)
        	{
        		int mid =( min+max)/2;
        		if(MyValue==arr[mid]) {
        			System.out.println("the value has been found in the index of "+ mid);
        			break;
        		}
        		else if (MyValue > arr[mid]) {
        			min=mid+1;
        		}
        		else if (MyValue < arr[mid]) {
        			max= mid-1;
        		}
        	
        	}
        	
        	if(min>max)
        	{
        		System.out.println("your value isn't present in the give array");
        	}
        	
        }
	
}

	

