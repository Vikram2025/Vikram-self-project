package in.vikram.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.vikram.model.Student;
import in.vikram.util.HibernateUtil;

public class LoadAndDeleteApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction transaction = null;
		boolean flag=false;
		try {
			session = HibernateUtil.getSession();
		
			if(session != null) {
				transaction = session.beginTransaction();
			}
			if(transaction!=null) {
				if(session !=null) {
					Student student = new Student();
					
					student.setId(14);
					session.delete(student);
				flag=true;
				}else {
					System.out.println("Record not found");
				}
				
				
			}
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}catch(Exception ee) {
			ee.printStackTrace();
		}finally {
			if(flag) {
				transaction.commit();
				System.out.println("Object deleted from the DB......" );
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
