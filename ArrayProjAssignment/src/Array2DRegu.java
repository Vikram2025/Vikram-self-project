import java.util.Scanner;

public class Array2DRegu {

	public static void main(String[] args) {
		// for regular 2Daraay 
//		int [][]ar=new int [3][5];
		// for jagged 2D array 
		int [][]ar=new int [3][];
		ar[0]= new int [2];
		ar[1]= new int [3];
		ar[2]= new int [4];
		Scanner Scan = new Scanner(System.in);
		for(int i = 0; i<ar.length; i++) {
			for (int j=0;j<ar[i].length;j++) {
				System.out.println("Student number  "+ i + " subject number " + j  );
				ar[i][j] = Scan.nextInt();
				
				
			}
		}
		System.out.println("the marks of student are as follows" );
		for(int i = 0; i<ar.length; i++) {
			for (int j=0;j<ar[i].length;j++) {
			System.out.print( ar[i][j]+ " " );
			
			}
			System.out.println();
	}
		
}
}