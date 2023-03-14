package ai.ineuron.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
//	this has been removed its a old approach
//Resource  resource = new ClassPathResource("beams.xml");
//BeanFactory factory = new XmlBeanFactory(resource);
//		this is the new approach
		ApplicationContext factory = new ClassPathXmlApplicationContext("beams.xml");

factory.getBean("Credit", CreditCardPayment.class);
factory.getBean("Debit", DebitCardPayment.class);
PaymentProcessing process = factory.getBean("Payment",PaymentProcessing.class);
process.doPayment(100.0);
	}

}
