package in.vikram.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.vikram.model.Student;
import in.vikram.util.HibernateUtil;

public class LoadApp {

	public static void main(String[] args) {
	int id = 15;
		Session session = null;
		
		boolean flag=false;
		try {
			session = HibernateUtil.getSession();
			
		
				if(session != null) {
				Student student = session.load(Student.class, id);
				if (session !=null) 
					System.out.println(student);
					else
					System.out.println("record not found for the given id  "+ id);
						
					
				}
				
			
		
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}catch(Exception ee) {
			ee.printStackTrace();
		}finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
		

	}

}
