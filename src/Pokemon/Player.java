package Pokemon;
import java.util.ArrayList;

public class Player extends ProjectIO{
	
	protected String name = "";
	protected ArrayList<Card> deck = new ArrayList<Card>();
	protected Card attackPosition = null;
	protected PokemonCard[] bench = new PokemonCard[6]; 
	protected ArrayList<Card> hand = new ArrayList<Card>();
	
	public Card JohnnyMan = new JohnnyMan();
	public Card JP = new Potion();
	
	public Player(String username){
		this.name = username;
	}

}
 