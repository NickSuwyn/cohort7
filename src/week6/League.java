package week6;

import java.util.ArrayList;
import java.util.List;

public class League {
	
	private List<Player> players;
	
	private final String[] positions = new String[] {"small forward", "center", "shooting gaurd", "power forward", "point gaurd"};
	private final String[] teams = new String[] {"Lakers", "Bulls", "Warriors", "Suns", "Jazz"};
	
	public League() {
		players = new ArrayList<Player>();
		
		for (String team : teams) {
			for (String position : positions) {
				players.add(new Player(position, team));
			}
		}
	}
	
	public void displayData() {
		for (Player player : players) {
			System.out.println(player.getTeamName() + "\t\t" + player.getPosition());
		}
	}
}