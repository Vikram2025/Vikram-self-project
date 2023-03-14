package ai.ineuron.beans;

public class CreditCardPayment implements IPay {
public CreditCardPayment() {
	System.out.println("I have created a Constructor for CreditCardPayment");
	
}
	public boolean payBill(Double amt) {
		System.out.println(" i am in paybill method credit card");
		return true;
	}

}
