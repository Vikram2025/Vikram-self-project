package ai.ineuron.beans;

public class DebitCardPayment implements IPay {
	
	public DebitCardPayment() {
		System.out.println("I have created a Constructor for DebitCardPayment");
		
	}

	public boolean payBill(Double amt) {
		System.out.println(" i am in paybill method of debit card");
		return true;
	}

}
