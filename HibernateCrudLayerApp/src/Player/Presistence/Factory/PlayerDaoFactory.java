package Player.Presistence.Factory;

import in.vikram.presistence.PlayerDao;
import in.vikram.presistence.PlayerDaoImp;

public class PlayerDaoFactory {

	private PlayerDaoFactory() {
		
	}
	public static PlayerDao playerdao=null;
	public static PlayerDao getPlayerDao() {
		if(playerdao==null) {
			playerdao =new PlayerDaoImp();
		}
		return playerdao;
	}
	
	
}
