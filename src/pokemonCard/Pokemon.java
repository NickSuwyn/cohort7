package pokemonCard;

public interface Pokemon {
	
	public boolean attack(Pokemon pokemon);
	
	public int takeDamage(Attack attack);
	
	public String getName();
	
	public Attack getAttack();
	
	public int getHp();
	
	public String getType();

}
