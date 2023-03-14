package ai.ineuron.beans;

public class PaymentProcessing {
private IPay pay;
public PaymentProcessing() {
	System.out.println(" PP obj is created ");
}
public void setPay(IPay pay) {
	System.out.println("i am in IPay method");
	this.pay=pay;
}
	public void doPayment(Double amt) {
		boolean paymentDone=pay.payBill(amt);
		if(paymentDone) {
			System.out.println("payment has been done successful");
		}
		else {
			System.out.println("payment has been failed");
		}
	}
}

