package Pokemon;
import java.util.Scanner;

abstract public class TrainerCard extends Card{
// potion, HP UP, Help From Mom, Evolution Stone
	
	public enum CardName{POTION, HP_UP, HELP_FROM_MOM, EVOLUTION_STONE};
	CardName name;
	public TrainerCard(CardName type) {
		this.name = type;
	}

	
	public static void execute(Player playing, Player waiting){
	/*	Scanner input = new Scanner(System.in); 
		if(name.equals(CardName.POTION)){
			System.out.println("Which Pokemon would you like to heal?");
			// use 'input' to select a pokemon
			// pokemon.hp += 20;
			//pokemon.bench[3]   ????
		}
		if(name.equals(CardName.HP_UP)){
			System.out.println("Which Pokemon would you like to boost?");
			// use 'input' to select a pokemon
			//pokemon.max_hp += 20;
			//pokemon.hp += 20;
		}
		if(name.equals(CardName.HELP_FROM_MOM)){
			
		}
*/
	}
	
}