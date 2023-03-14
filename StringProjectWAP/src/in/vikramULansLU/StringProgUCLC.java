package in.vikramULansLU;

public class StringProgUCLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1="vikRaM Kumar";
String S2="";
//char ch= 32;




for(int i = 0; i<S1.length() ;i++) {
	if((S1.charAt(i)>='a') && (S1.charAt(i)<='z') ) {
		S2 = S2+(char)(S1.charAt(i)-32);
		
		
//		
	}
	else if((S1.charAt(i)>='A') && (S1.charAt(i)<='Z')) {
		S2 = S2+(char)(S1.charAt(i)+32);
		
	}
	
	

}


System.out.println(S2);


	}
		

		
		
	

	


}
