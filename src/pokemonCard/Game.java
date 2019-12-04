package pokemonCard;

public class Game {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		
//		for (int i = 0; i < 10; i++) {
//			Pokemon currentCard = myDeck.drawCard();
//			System.out.println(currentCard.getName() + " HP: " + currentCard.getHp() 
//				+ " Type: " + currentCard.getType());
//		}
		
		Pokemon p1 = myDeck.drawCard();
		Pokemon p2 = myDeck.drawCard();
		
		System.out.println("p1 Name: " + p1.getName() + " HP: " + p1.getHp() + " Type: " + p1.getType());
		System.out.println("p2 Name: " + p2.getName() + " HP: " + p2.getHp() + " Type: " + p2.getType());
		
		while (p1.getHp() > 0 && p2.getHp() > 0) {
			if (p1.attack(p2)) {
				System.out.println(p1.getName() + " wins!");
				break;
			} else if (p2.attack(p1)) {
				System.out.println(p2.getName() + " wins!");
				break;
			}
			System.out.println("---------------------------------------------------");
			System.out.println("p1 Name: " + p1.getName() + " HP: " + p1.getHp() + " Type: " + p1.getType());
			System.out.println("p2 Name: " + p2.getName() + " HP: " + p2.getHp() + " Type: " + p2.getType());
		}
	}
	
}
