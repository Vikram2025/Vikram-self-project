import java.util.Scanner;

class HomeLoan{
	int Amount1;
	long Home() {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the amount");
		Amount1=Scan.nextInt();
		
		return Amount1;
		
	}
}
class CarLoan{
	int Amount2;
	long Car() {
		Scanner Scan = new Scanner(System.in);
		Amount2=Scan.nextInt();
		
		return Amount2;
		
	}

}
class EducationLoan{
	int Amount3;
	long Education() {
		Scanner Scan = new Scanner(System.in);
		Amount3=Scan.nextInt();
		
		return Amount3;
		
	}

}
class GoldLoan{
	int Amount4;
	long Gold() {
		Scanner Scan = new Scanner(System.in);
		Amount4=Scan.nextInt();
		
		return Amount4;
		
	}

}
class BusinessLoan{
	int Amount5;
	long Business() {
		Scanner Scan = new Scanner(System.in);
		Amount5=Scan.nextInt();
		
		return Amount5;
		
	}
	

	
}

class SimpleInterest{
	HomeLoan HL = new HomeLoan();
	Long HLA =HL.Home();
	CarLoan CL = new CarLoan();
	Long CLA =CL.Car();
	GoldLoan GL = new GoldLoan();
	Long GLA =GL.Gold();
	EducationLoan EL = new EducationLoan();
	Long ELA =EL.Education();
	BusinessLoan BL = new BusinessLoan();
	Long BLA =BL.Business();
	int year = 1;
	int R= 10;
	long HomeL() {
	long FinalAmount = HLA*((R/100 )* 1);
	return FinalAmount;
	}
	
			

}
public class LoanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SimpleInterest SI = new SimpleInterest();
             long  HomeSI=SI.HomeL();
             System.out.println(HomeSI);
	}

}
