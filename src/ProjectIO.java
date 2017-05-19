import java.util.Scanner;

public class ProjectIO extends PokemonGame{
	public static void turnEngine(){
		System.out.println("Hello, and welcome to Pokemon");
		makePlayers();
		
		
	}
	public static void makePlayers(){
		//player 1
		Scanner input = new Scanner(System.in);
		String name = "";
		System.out.println("Player 1, please enter your name");
		name = input.next();
		PokemonGame.playing.name = name;
		System.out.println("Welcome "+name+"!");
		//player 2
		System.out.println("Player 2, please enter your name");
		name = input.next();
		PokemonGame.waiting.name = name;
		System.out.println("Welcome "+name+"!");
		//allow hand to be created for each player, class hand. hand player1 = new hand hand; player 2 = new hand 
		 // 6 cards added, cards should move on their own when the game has started		
				//when hand player.playing created, cards move 
		//player.playing owns deck 1, when switched the player.playing owns deck 2
		//playing looks @ hand* 
		
	}
	public static void changeTurn(){
		Player temp = new Player();
		temp = PokemonGame.waiting;
		PokemonGame.waiting = PokemonGame.playing;
		PokemonGame.playing = temp;

	}
}
