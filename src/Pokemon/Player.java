package Pokemon;
import java.util.ArrayList;

public class Player extends ProjectIO{
	
	protected static String name = "";
	protected ArrayList<Card> deck = new ArrayList<Card>();
	protected Card attackPosition = new Card();
	protected Card[] bench = new Card[6]; 
	protected ArrayList<Card> hand = new ArrayList<Card>();
	

	public static void player(String username){
		name = username;
	}
	
	
}
