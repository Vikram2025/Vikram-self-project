import java.util.*;
public class Array3D {

	public static void main(String[] args) {
	Scanner Scan = new Scanner(System.in);
	
	
	//3D regular array.
	//int[][][] ar1 = new int [2][3][4];
	
	
	//3D jagged array.
	int[][][] ar1 = new int [2][][];
	ar1[0]= new int [3][];
	ar1[1]= new int [1][];
	ar1[0][0]= new int [2];
	ar1[0][1]= new int [1];
	ar1[0][2]= new int [3];
	ar1[1][0]= new int [1];
	
	
	for(int i =0; i<ar1.length ;i++ )
	{
		for(int j=0;j<ar1[i].length;j++) {
			for(int k=0;k<ar1[i][j].length; k++) {
				System.out.println("entering into school "+ i + " the class number now is  " + j + " the student roll number is  " + k);
				ar1[i][j][k]= Scan.nextInt();
			}
		}
	}
System.out.println("the student marks are as follows ");
System.out.println();
for(int i =0; i<ar1.length ;i++ )
{
	System.out.println(" the school number "+ i +" student marks are as follows " );
	for(int j=0;j<ar1[i].length;j++) {
		for(int k=0;k<ar1[i][j].length; k++) {
			System.out.print(ar1[i][j][k] + " ");
			
		}
		System.out.println();
	}
	System.out.println();
}
 
	}

}
