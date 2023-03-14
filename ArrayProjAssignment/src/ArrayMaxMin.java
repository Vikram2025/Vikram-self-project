
public class ArrayMaxMin {

	public static void main(String[] args) {
		int [] arr =  {10,35,78,44,66,35,20};
		int max=arr[0];
		System.out.println("maximum value in the give array is ");
		for(int i=0; i<arr.length;i++) {
		if(max<arr[i])
		{
			max = arr[i];
			
//			System.out.println(max);
		}

	
}
		for(int elem : arr) {
			System.out.println(elem);	
		}
		
		System.out.println(max);
		
		System.out.println("------------------------------------");
		System.out.println("the minimum value in the give array is ");
		int [] arr1 =  {10,35,78,99,23,56,78,2,5,0};
		int min=arr1[0];
		for(int i=0; i<arr1.length;i++) {
		if(min>arr1[i])
		{
			min = arr1[i];
		}
		System.out.println(arr[i]);
		}
		System.out.println(min);
	}

}
