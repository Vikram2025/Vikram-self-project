package in.vikram.DuplicateRemoveString;

import java.util.Scanner;

public class RemoveDuplicateString {

	public static void main(String[] args) {
	Scanner scanner =  new Scanner (System.in);
	System.out.println("Enter the  First String value in Lower case only ");
	String S1 = scanner.next();
    String s2 = "";
	
	for(int i=0;i<S1.length();i++) {
		boolean isDuplicate = false;
		for(int j = i+1;j<S1.length();j++) {
			if(S1.charAt(i) == S1.charAt(j)) {
				System.out.println(S1.charAt(i));
				isDuplicate = true;
				break;
			}
		}
		if(!isDuplicate) {
			s2 = s2 + S1.charAt(i);
		}
	}
	System.out.print(s2);
	

		
 

	}

}
