package pokemonCard;

public class Attack {
	
	private int power;
	private String type;
	
	public Attack(int power, String type) {
		this.power = power;
		this.type = type;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

}