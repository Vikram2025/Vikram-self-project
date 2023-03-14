package in.vikram.servicelayer;

import Player.Presistence.Factory.PlayerDaoFactory;
import PlayerDTO.PlayerdtoObj;
import in.vikram.presistence.PlayerDao;

public class PlayerServiceImpl implements PlayerService {

	 private PlayerDao pyrdao;
	 @Override
	public String addPlayer(PlayerdtoObj player) {
            pyrdao= 	PlayerDaoFactory.getPlayerDao();
		
		return pyrdao.addPlayer(player);
	}

	@Override
	public PlayerdtoObj searchPlayer(Integer id) {
	      
		 pyrdao = 	PlayerDaoFactory.getPlayerDao();
		return pyrdao.searchPlayer(id);
	}

	@Override
	public String updatePlayer(PlayerdtoObj player) {
		  pyrdao= 	PlayerDaoFactory.getPlayerDao();
		return pyrdao.updatePlayer(player);
	}

	@Override
	public String deletePlayer(Integer id) {
		  pyrdao= 	PlayerDaoFactory.getPlayerDao();
		return pyrdao.deletePlayer(id);
	}



}
