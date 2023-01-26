package in.vikram.presistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import JDBCUTIL.JdbcUtil;
import PlayerDTO.PlayerdtoObj;

public class PlayerDaoImp implements PlayerDao {
Connection connection = null;
PreparedStatement PreSta = null;
PlayerdtoObj ply = null;
	String insertQuery = "insert into Player(id,name,teamname,salary) values(?,?,?,?)";
	String deleteQuery = "delete from  Player where id = ? ";
	String updateQuery = "update player set name=?,teamname =? ,salary=? where id= ?";
	String selectQuery = "select id,name,teamname,salary from player where id =?";
	public String addPlayer(Integer id, String name, String teamname, Integer salary) {
		try {
		connection=JdbcUtil.getValues();
		PreSta =connection.prepareStatement(insertQuery);
		PreSta.setInt(1, id);
		PreSta.setString(2, name);
		PreSta.setString(3, teamname);
		PreSta.setInt(4, salary);
		
		int lineinsert =PreSta.executeUpdate();
		if (lineinsert==1) {
			return"success";
			
		}
		else {
			return "failed";
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PlayerdtoObj searchPlayer(Integer id) {
	
		try {
			connection=JdbcUtil.getValues();
			PreSta =connection.prepareStatement(selectQuery);
			PreSta.setInt(1, id);
			ResultSet resultset = PreSta.executeQuery();
		
		if(resultset.next()) {
			ply = new PlayerdtoObj();
			
			ply.setId(resultset.getInt(1));
			ply.setName(resultset.getString(2));
			ply.setTeamname(resultset.getString(3));
			ply.setSalary(resultset.getInt(4));
		}
			
		
		
			
		
				
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return ply;
	}

	@Override
	public String updatePlayer(Integer id, String name, String teamname, Integer salary) {
		try {
		connection=JdbcUtil.getValues();
		PreSta =connection.prepareStatement(updateQuery);
		PreSta.setInt(4, id);
		PreSta.setString(1, name);
		PreSta.setString(2, teamname);
		PreSta.setInt(3, salary);
		
	
		
		int lineinsert =PreSta.executeUpdate();
		if (lineinsert==1) {
			return"success";
			
		}
		else {
			return "failed";
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deletePlayer(Integer id) {
		Connection connection = null;
		PreparedStatement PreSta = null;

			
				try {
				connection=JdbcUtil.getValues();
				PreSta =connection.prepareStatement(deleteQuery);
				PreSta.setInt(1, id);
				
				
				int linedeleted =PreSta.executeUpdate();
				if (linedeleted==1) {
					return"success";
					
				}
				else {
					return "failed";
					
				}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return null;
	}
}

			
