package in.vikram.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.vikram.model.Student;
import in.vikram.util.HibernateUtil;

public class DeleteRecordApp {

	public static void main(String[] args) {
	
		Session session = null;
		Transaction transaction = null;
		int id = 10;
		boolean flag=false;
		try {
			session = HibernateUtil.getSession();
			Student student = session.get(Student.class, id);
			if(session != null) {
				transaction = session.beginTransaction();
			}
			if(transaction!=null) {
				if(student !=null) {
					
					session.delete(student);
			
				flag=true;
				}else {
					System.out.println("Record not found");
				}
			flag=true;
				
			}
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}catch(Exception ee) {
			ee.printStackTrace();
		}finally {
			if(flag) {
				transaction.commit();
				System.out.println("Object deleted in DB......" );
			}
			else {
				
				System.out.println("Object not deleted in DB because its not in  DB......" );	
				transaction.rollback();
			}
		}
		
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}

}
