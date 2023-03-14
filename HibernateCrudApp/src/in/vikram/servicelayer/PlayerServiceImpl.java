package in.vikram.servicelayer;

import Player.Presistence.Factory.PlayerDaoFactory;
import PlayerDTO.PlayerdtoObj;
import in.vikram.presistence.PlayerDao;

public class PlayerServiceImpl implements PlayerService {

	 private PlayerDao pyrdao;
	public String addPlayer( String name, String teamname, Integer salary) {
            pyrdao= 	PlayerDaoFactory.getPlayerDao();
		
		return pyrdao.addPlayer( name, teamname, salary) ;
	}

	@Override
	public PlayerdtoObj searchPlayer(Integer id) {
	      
		 pyrdao = 	PlayerDaoFactory.getPlayerDao();
		return pyrdao.searchPlayer(id);
	}

	@Override
	public String updatePlayer(Integer id, String name, String teamname, Integer salary) {
		  pyrdao= 	PlayerDaoFactory.getPlayerDao();
		return pyrdao.updatePlayer(id, name, teamname, salary);
	}

	@Override
	public String deletePlayer(Integer id) {
		  pyrdao= 	PlayerDaoFactory.getPlayerDao();
		return pyrdao.deletePlayer(id);
	}

}
