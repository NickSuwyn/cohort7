package week6;

public class Player {
	
	private String position;
	private String teamName;
	
	private String[] valueName = new String[] {"Two", "Three", "Ace"};
	
	public Player(String position, String teamName) {
		this.position = position;
		this.teamName = teamName;
		deriveName(value, suite)
	}
	
	public void deriveName(int value, String suite) {
		this.name = valueName[value - 2] + " of " + suite;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}
