package HibernateUTIL;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import PlayerDTO.PlayerdtoObj;

public class HibernateUtil {
	private static SessionFactory  sessionFactory=null;
	private static Session session =null;
	private HibernateUtil() {
	
	}
	static {
		System.out.println("i am in SF");
			sessionFactory =new Configuration().configure().addAnnotatedClass(PlayerdtoObj.class).buildSessionFactory();
			
		
	}

	public static Session getSession() {
		if(session==null)
				session= sessionFactory.openSession();
		return session ;
	
	}
	
	public static void closeSession(Session session) {
		if(session!=null)
		session.close();
	}
	
	public static void closeSessionFactory()
	{
		if(sessionFactory!=null)
			sessionFactory.close();
	}
	
	
}
