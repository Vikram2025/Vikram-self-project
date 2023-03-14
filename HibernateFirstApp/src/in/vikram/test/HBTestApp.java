package in.vikram.test;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.vikram.model.Student;

public class HBTestApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("\\in\\vikram\\test\\hibernate.cfg.xml");
		
		
		
		//
		SessionFactory sessionfactory =configuration.buildSessionFactory();	
		
		
		//Usinng SessionFactory object,get only one session object to perform our presistence operation 
		Session session=sessionfactory.openSession();//connection Object , ORM-dialect,L1-cache,TXTManagement
		
		//Begin the Transaction as the operation is non-select
		Transaction transaction= session.beginTransaction();
		
		//create presistance object
	Student student =new Student();
		
		student.setId(10);
		student.setName("vikram");
		student.setAge(25);
		student.setAddress("425 Mint Street");
		
		
		session.save(student);
		
		//Generate the Query and send it to trhe satabase 
		transaction.commit();

		System.out.println("Object is been saved in database");

	}

}

