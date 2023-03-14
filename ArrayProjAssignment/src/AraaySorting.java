
public class AraaySorting {

	public static void main(String[] args) {
char [] arr = {'a','z','u','p','t','x'};
char min;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			min= arr[i];
			arr[i]=arr[j];
			arr[j]=min;
		}
	}

}
for(char elem : arr) {
	System.out.println((elem));	
}
	
	}

}
