package in.vikram.presistence;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mysql.cj.protocol.Resultset;

import HibernateUTIL.HibernateUtil;
import PlayerDTO.PlayerdtoObj;


public class PlayerDaoImp implements PlayerDao {
	
	
             Session session = HibernateUtil.getSession();
             
	
	
	@Override
	public String addPlayer(String name, String teamname, Integer salary) {
	
		Transaction transaction =session.beginTransaction();
	
		String status;
		boolean flag = false;
	try {
		if(transaction !=null);
		{
		PlayerdtoObj player = new PlayerdtoObj();
	
		
		player.setName(name);
		player.setTeamname(teamname);
		player.setSalary(salary);
		
		 session.save(player);

              flag=true;
		
		}
	}catch(Exception e ) {
		e.printStackTrace();
	}finally {
		if(flag) {
			transaction.commit();
			 status = "success";
		
		}else {
			transaction.rollback();
			status = "failure";
		}
	}
	return status;	
	}
		
	

	@Override
	public PlayerdtoObj searchPlayer(Integer id) {
		
		PlayerdtoObj player = session.get(PlayerdtoObj.class, id);
	
		if(player!=null)
			return player;
		else 
			return null;
	}

	@Override
	public String updatePlayer(Integer id, String name, String teamname, Integer salary) {
		PlayerdtoObj player = session.get(PlayerdtoObj.class, id);

		Transaction transaction =session.beginTransaction();
	
		String status;
		boolean flag = false;
		try {
		if(transaction!=null) {
		player.setName(name);
		player.setTeamname(teamname);
		player.setSalary(salary);
		
		 session.saveOrUpdate(player);
         flag=true;
 		
		}
	}catch(Exception e ) {
		e.printStackTrace();
	}finally {
		if(flag) {
			transaction.commit();
			 status = "success";
		
		}else {
			transaction.rollback();
			status = "failure";
		}
	}
	return status;	
	
			
		
	}

	@Override
	public String deletePlayer(Integer id) {
		PlayerdtoObj player = searchPlayer(id);

		Transaction transaction =session.beginTransaction();
		String status;
		boolean flag = false;
	try {
	
		if(player !=null)
		{
           session.delete(player);
			flag=true;
		
		}
		else {
			return "not found";
		}
	}catch(Exception e ) {
		e.printStackTrace();
	}finally {
		if(flag) {
			transaction.commit();
			 status = "success";
		
		}else {
			transaction.rollback();
			status = "failure";
		}
	}
	return status;	
	
	}
}

			
