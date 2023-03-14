package in.vikram.CountVSCNinString;

import java.util.Scanner;

public class CountVCNS {

	public static void main(String[] args) {
		int Vowles=0;
		int SpecialChar=0;
		int Numbers =0;
		System.out.println("Kindly put your string in Lowercase");
//		
//	Scanner scan = new Scanner(System.in);
//		
		String myvalue= "vikram 12 @";
;		 myvalue = myvalue.trim();
//		char ch[] = new char[myvalue.length()];
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			ch[i]=myvalue.charAt(i);
//		}
//		
		
		
		
		for(int i=0;i<myvalue.length();i++) {
			char ch = myvalue.charAt(i);
			
			if(ch>='a'&& ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				Vowles++;
			
			}
			
			else if (ch>='0' && ch<='9') {
					Numbers++;
				}
		else {
					
					SpecialChar++;
				}
			
				
			
			
			
		}
		
		System.out.println("the number of vowles is "+ Vowles);
		System.out.println("the number of Numbers is "+ Numbers);
		System.out.println("the number of SpecialChar is "+ SpecialChar);

	}

}
