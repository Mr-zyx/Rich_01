package user;

import java.util.List;

public class CurrentPlayer {
	private List<Player> allPlayers;
	private int which=0;//��ǰ�ڼ������
	public CurrentPlayer(List<Player> players){
		allPlayers=players;
	}
	public Player getCurrentPlayer(){//���ص�ǰ���
		if(which==allPlayers.size())
			which=0;
		return allPlayers.get(which++);
		
	}
}
