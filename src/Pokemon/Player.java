package Pokemon;
import java.util.ArrayList;

public class Player extends PokemonGame{
	
	static String name = "";
	ArrayList<Card> deck = new ArrayList<Card>();
	Card attackPosition = new Card();
	Card[] bench = new Card[6]; 
	ArrayList<Card> hand = new ArrayList<Card>();
	

	public static void player(String username){
		name = username;
	}
}
