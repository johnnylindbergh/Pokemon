package Pokemon;
import java.util.Scanner;

public class ProjectIO {
	public static Player playing;
	public static Player waiting;
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		turnEngine();
	}
	
	public static int commandValueParse(String s){
		return Integer.parseInt(s);
	}
	public static String commandParse(String s){
		return s;
	}
	
	
	public static void turnEngine(){
		System.out.println("Hello, and welcome to Pokemon");
		makePlayers();
		System.out.println(playing);
		((TrainerCard) playing.JP).execute(playing, waiting);
	}

	public static void makePlayers(){
		//player 1
		//Scanner input = new Scanner(System.in);
		String name = "";
		System.out.println("Player 1, please enter your name");
		name = input.next();
		playing = new Player(name);
		System.out.println("Welcome "+name+"!");
		//player 2
		System.out.println("Player 2, please enter your name");
		name = input.next();
		waiting = new Player(name);
		System.out.println("Welcome "+name+"!");
		//input.close();
	}
	public static void changeTurn(){
		Player temp;
		temp = waiting;
		waiting = playing;
		playing = temp;

	}
}

//this needs to be able handle these commands 
//print field:prints all Pokemon in both players’ fields, and their HP (status)
//print hand:prints only your hand, and the number of cards left in each player’s deck
//attack:the Pokemon in your arena position attacks,ending your turn
//switch [NUMBER]: switches your arena position Pokemon with the Pokemon in the indicated spot in the bench. If that spot is empty, the Pokemon in the arena position just goes to that spot in the bench.
//play [NUMBER]:chooses a card from your hand to play. If it is a Pokemon card,it is put in the bench (if there is no room, it is discarded); if it’s a Trainer card, its effect is carried out.
//pass:endsyourturn

