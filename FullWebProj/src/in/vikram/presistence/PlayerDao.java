package in.vikram.presistence;

import PlayerDTO.PlayerdtoObj;

public interface PlayerDao {
	public String addPlayer(PlayerdtoObj player);
	public PlayerdtoObj searchPlayer(Integer id);
	public String deletePlayer(Integer id);
	public String updatePlayer(PlayerdtoObj player);
}
