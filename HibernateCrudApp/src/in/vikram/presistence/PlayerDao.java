package in.vikram.presistence;

import PlayerDTO.PlayerdtoObj;

public interface PlayerDao {
	public String addPlayer(String name,String teamname,Integer salary);
	public PlayerdtoObj searchPlayer(Integer id);
	public String updatePlayer(Integer id,String name,String teamname,Integer salary);
	public String deletePlayer(Integer id);
}
