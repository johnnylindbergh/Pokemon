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
		
		
	}
	public static void changeTurn(){
		Player temp = new Player();
		temp = PokemonGame.waiting;
		PokemonGame.waiting = PokemonGame.playing;
		PokemonGame.playing = temp;

	}
}
