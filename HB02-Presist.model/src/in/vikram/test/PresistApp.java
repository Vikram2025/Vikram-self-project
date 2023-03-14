package in.vikram.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.vikram.model.Student;
import in.vikram.util.HibernateUtil;

public class PresistApp {

	public static void main(String[] args) {
	
		Session session = null;
		Transaction transaction = null;
		boolean flag=false;
		try {
			session = HibernateUtil.getSession();
			if(session != null) {
				transaction = session.beginTransaction();
			}
			if(transaction!=null) {
				
				Student student = new Student();
				student.setId(11);
				student.setName("ram");
			student.setAge(26);
				student.setAddress("KKR");
				
				session.save(student);
				flag=true;
			}
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}catch(Exception ee) {
			ee.printStackTrace();
		}finally {
			if(flag) {
				transaction.commit();
				System.out.println("Object saved to DB......" );
			}
			else {
				
				System.out.println("Object not  saved to DB......" );	
				transaction.rollback();
			}
		}
		
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}

}
