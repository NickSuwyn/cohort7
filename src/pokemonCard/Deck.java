package pokemonCard;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<Pokemon> cards;
	
	public Deck() {
		cards = new ArrayList<Pokemon>();
		
		for (int i = 0; i < 10; i++) {
			cards.add(createRandomPokemon());
		}
	}
	
	public Pokemon drawCard() {
		return cards.remove(0);
	}
	
	private Pokemon createRandomPokemon() {
		String name = generateRandomString(6);
		int hp = generateRandomInt(10, 100);
		String type = generateRandomType();
		Attack attack = new Attack(generateRandomInt(5, 25), generateRandomType());
		return new PokemonImpl(name, hp, type, attack);
	}
	
	private String generateRandomType() {
		int choice = generateRandomInt(1, 4);
		
		if (choice == 1) {
			return "water";
		} else if (choice == 2) {
			return "fire";
		}
		return "grass";
	}
	
	private int generateRandomInt(int min, int max) {
		return new Random().nextInt((max - min) + 1) + 1;
	}
	
	private String generateRandomString(int length) {
		byte[] array = new byte[length]; 
	    new Random().nextBytes(array);
	    return new String(array, Charset.forName("UTF-8"));
	}

}
