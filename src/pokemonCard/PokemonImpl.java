package pokemonCard;

public class PokemonImpl implements Pokemon {
	
	private String name;
	private int hp;
	private String type;
	private Attack attack;
	
	public PokemonImpl(String name, int hp, String type, Attack attack) {
		this.name = name;
		this.hp = hp;
		this.type = type;
		this.attack = attack;
	}
	
	@Override
	public boolean attack(Pokemon pokemon) {
		return pokemon.takeDamage(attack) < 1;
	}
	
	@Override
	public int takeDamage(Attack attack) {
		int damage = attack.getPower();
		
		if (type == "water" && attack.getType() == "grass"
				|| type == "fire" && attack.getType() == "water"
				|| type == "grass" && attack.getType() == "fire") {
			damage *= 2;
		} 
		hp -= damage;
		return hp;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Attack getAttack() {
		return attack;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public String getType() {
		return type;
	}

}
