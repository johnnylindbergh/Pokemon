package Pokemon;
import java.util.ArrayList;

public class Player extends ProjectIO{

	protected String name = "";
	protected Card attackPosition = null;
	protected PokemonCard[] bench = new PokemonCard[6]; 
	protected ArrayList<Card> hand = new ArrayList<Card>();
	protected boolean isAlive = true;
	public Card JohnnyMan = new JohnnyMan();
	public Card JP = new Potion();
	
	public Player(String username){
		this.name = username;
	}
	public void switchPokemon(Integer position){
		Card temp = attackPosition;
		attackPosition=bench[position];
		bench[position] = (PokemonCard)temp;
	}
	public void play(Integer position){
		Card temp = hand.get(position);
		if(temp.isPokemonCard){
			hand.remove(position);
			for (int i = 0; i<bench.length-1;i++){
				System.out.print(i);
				if ((PokemonCard)bench[i] == null){
					System.out.print("Found an empty bench position");
					bench[i] = (PokemonCard)temp;
					System.out.print(bench[i]);
					break;
				}
				System.out.print("Bench is full, you just wasted a card");
			}
		}
	}
}
 
