package Player.Service.Factory;

import in.vikram.servicelayer.PlayerService;
import in.vikram.servicelayer.PlayerServiceImpl;

public class PlayerServiceFactoryObj {
	
	private PlayerServiceFactoryObj() {
		
	}
	public static PlayerService playerservice=null;
	public static PlayerService getPlayerService() {
		if(playerservice==null) {
			playerservice = new PlayerServiceImpl();
		}
		return playerservice;
	}

}
