package in.exception.pro;

import java.util.Scanner;


class MyException extends Exception{
	
	
	
}

class FaceBook{
	String S1="vikram";
    int a=14432;
   String S2;
    int b;
    
public void input()
{
    Scanner scan = new Scanner(System.in);
    
    System.out.println("enter the username");
    S2=scan.next();
    
    System.out.println("enter the password");
     b= scan.nextInt();
    
    
    

    
    
}



public void checking() throws MyException {
	
	if((S1.equalsIgnoreCase(S2))&&(a==b)) {
		
		System.out.println("Welcome to your faceBook Account.....");
	}
	else {
	MyException ME = new MyException ();
	throw ME;
	
	}
	
	
}
}

class FBCompany{
	 public void vaildation()
	 {
		 FaceBook FB = new FaceBook();
		 
		try {
		 FB.input();
		 
		 FB.checking();
		}catch(MyException me) {
			try {
				 FB.input();
				 
				 FB.checking();
				}catch(MyException me1) {
					try {
						 FB.input();
						 
						 FB.checking();
						}catch(MyException me2) {
							System.out.println("Seems its not your Account.....");
							
						}
					
				}
			
		}
		
	 
	
	 
		 
	 }
}


public class Lauch1 {

	public static void main(String[] args) {
	
  
    FBCompany FBC=new FBCompany();
    FBC.vaildation();
        
        
	}

}
