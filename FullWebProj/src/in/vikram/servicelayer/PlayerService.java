package in.vikram.servicelayer;

import PlayerDTO.PlayerdtoObj;

public interface PlayerService {
	public String addPlayer(PlayerdtoObj player);
	public PlayerdtoObj searchPlayer(Integer id);
   public String deletePlayer(Integer id);
	public String updatePlayer(PlayerdtoObj player);
	




}
